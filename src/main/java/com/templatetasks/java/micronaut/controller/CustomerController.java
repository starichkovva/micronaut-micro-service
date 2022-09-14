package com.templatetasks.java.micronaut.controller;

import com.templatetasks.java.micronaut.data.model.Customer;
import com.templatetasks.java.micronaut.service.CustomerService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;
import jakarta.inject.Inject;

/**
 * @author Vadim Starichkov (starichkovva@gmail.com)
 * @since 14.09.2022 15:24
 */
@Controller("/customer")
@ExecuteOn(TaskExecutors.IO)
public class CustomerController {

    private final CustomerService service;

    @Inject
    public CustomerController(CustomerService customerService) {
        this.service = customerService;
    }

    @Get("/{id}")
    public Customer getCustomerById(Long id) {
        return service.get(id);
    }
}
