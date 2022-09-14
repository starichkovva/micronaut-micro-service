package com.templatetasks.java.micronaut.controller;

import com.templatetasks.java.micronaut.data.model.Order;
import com.templatetasks.java.micronaut.service.OrderService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;
import jakarta.inject.Inject;

/**
 * @author Vadim Starichkov (starichkovva@gmail.com)
 * @since 14.09.2022 15:24
 */
@Controller("/order")
@ExecuteOn(TaskExecutors.IO)
public class OrderController {

    private final OrderService service;

    @Inject
    public OrderController(OrderService orderService) {
        this.service = orderService;
    }

    @Get("/{id}")
    public Order getOrderById(Long id) {
        return service.get(id);
    }
}
