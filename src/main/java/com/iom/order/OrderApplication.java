package com.iom.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class OrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}


	//public void run(String... var1) {
//		this.repository.deleteAll().block();
//		LOGGER.info("Deleted all data in container.");
//
//		final Persons testUser = new Persons("testId", "testFirstName", "testLastName", "test address line one");
//
//		// Save the User class to Azure Cosmos DB database.
//		final Mono<Persons> saveUserMono = repository.save(testUser);
//
//		final Flux<Persons> firstNameUserFlux = repository.findByFirstName("testFirstName");
//
//		//  Nothing happens until we subscribe to these Monos.
//		//  findById will not return the user as user is not present.
//		final Mono<Persons> findByIdMono = repository.findById(testUser.getId());
//		final Persons findByIdUser = findByIdMono.block();
//		Assert.isNull(findByIdUser, "User must be null");
//
//		final Persons savedUser = saveUserMono.block();
//		Assert.state(savedUser != null, "Saved user must not be null");
//		Assert.state(savedUser.getFirstName().equals(testUser.getFirstName()), "Saved user first name doesn't match");
//
//		firstNameUserFlux.collectList().block();
//
//		final Optional<Persons> optionalUserResult = repository.findById(testUser.getId()).blockOptional();
//		Assert.isTrue(optionalUserResult.isPresent(), "Cannot find user.");
//
//		final Persons result = optionalUserResult.get();
//		Assert.state(result.getFirstName().equals(testUser.getFirstName()), "query result firstName doesn't match!");
//		Assert.state(result.getLastName().equals(testUser.getLastName()), "query result lastName doesn't match!");
//
//		LOGGER.info("findOne in User collection get result: {}", result.toString());


	//}
}