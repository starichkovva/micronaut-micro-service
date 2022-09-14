package com.templatetasks.java.micronaut.service.impl;

import com.templatetasks.java.micronaut.data.access.OrderRepository;
import com.templatetasks.java.micronaut.data.model.Order;
import com.templatetasks.java.micronaut.service.OrderService;
import io.micronaut.context.annotation.Primary;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

/**
 * @author Vadim Starichkov (starichkovva@gmail.com)
 * @since 14.09.2022 15:26
 */
@Primary
@Singleton
public class OrderServiceImpl implements OrderService {

    private final OrderRepository repository;

    @Inject
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.repository = orderRepository;
    }

    @Override
    public Order get(Long id) {
        return repository.findById(id).orElse(null);
    }
}
