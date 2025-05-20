package com.polarbookshop.orderservice.order;

import com.polarbookshop.orderservice.order.domain.Order;
import reactor.core.publisher.Flux;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface OrderRepository extends ReactiveCrudRepository<Order,Long> {
	Flux<Order> findAllByCreatedBy(String userId);
}
