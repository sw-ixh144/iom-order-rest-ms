package com.iom.order.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.azure.spring.data.cosmos.repository.Query;
import com.fasterxml.jackson.databind.JsonNode;
import com.iom.order.entity.OrderLine;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderLineRepository extends CosmosRepository<OrderLine, String> {
    @Query("select * from c where c.order_id = @order_id")
    Iterable<OrderLine> findByOrderId(@Param("order_id") String order_id);

    @Query("select * from c where c.order_id = @order_id")
    Page<JsonNode> queryOrderLineByOrderId(@Param("order_id") String order_id, Pageable pageable);

    @Query("select * from c")
    Iterable<OrderLine> findAll();
}