package com.iom.order.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.iom.order.exception.OrderNotFoundException;
import com.iom.order.entity.Order;
import com.iom.order.entity.OrderHeader;
import com.iom.order.entity.OrderLine;
import com.iom.order.repository.OrderHeaderRepository;
import com.iom.order.repository.OrderLineRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;

@RestController
public class OrderController {

    private final OrderHeaderRepository orderHeaderRepository;
    private OrderLineRepository orderLineRepository;

    OrderController(OrderHeaderRepository orderHeaderRepository, OrderLineRepository orderLineRepository) {
        this.orderHeaderRepository = orderHeaderRepository;
        this.orderLineRepository = orderLineRepository;
    }

    @RequestMapping(value = "/orders/{id}", method = RequestMethod.GET
            , produces = "application/json")
    @ResponseBody
    String getOrder(@PathVariable String id) {
        try {
            Iterator<OrderHeader> orderHeaderIterator = orderHeaderRepository.findByOrderId(id).iterator();
            Order order = new Order();
            orderHeaderIterator.forEachRemaining(header -> order.setOrderHeader(header));
            Iterator<OrderLine> orderLineIterator = orderLineRepository.findByOrderId(id).iterator();
            orderLineIterator.forEachRemaining(line -> order.setLines(line));
            Gson gsonLine = new GsonBuilder().setPrettyPrinting().create();
            String jsonLine = gsonLine.toJson(order);
            return jsonLine;
        } catch (Exception ex) {
            throw new OrderNotFoundException(id);
        }
    }


    @RequestMapping(value = "/orders", method = RequestMethod.GET
            , produces = "application/json")
    @ResponseBody
    String getAllOrders() {

            Iterator<OrderHeader> orderHeaderIterator = orderHeaderRepository.findAll().iterator();
            Order order = new Order();
            orderHeaderIterator.forEachRemaining(header -> order.setOrderHeader(header));
            Iterator<OrderLine> orderLineIterator = orderLineRepository.findAll().iterator();
            orderLineIterator.forEachRemaining(line -> order.setLines(line));
            Gson gsonLine = new GsonBuilder().setPrettyPrinting().create();
            String jsonLine = gsonLine.toJson(order);
            return jsonLine;
        }
    }

