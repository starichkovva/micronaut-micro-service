package com.templatetasks.java.micronaut.service.impl;

import com.templatetasks.java.micronaut.data.access.CustomerRepository;
import com.templatetasks.java.micronaut.data.model.Customer;
import com.templatetasks.java.micronaut.service.CustomerService;
import io.micronaut.context.annotation.Primary;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

/**
 * @author Vadim Starichkov (starichkovva@gmail.com)
 * @since 14.09.2022 15:26
 */
@Primary
@Singleton
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository repository;

    @Inject
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.repository = customerRepository;
    }

    @Override
    public Customer get(Long id) {
        return repository.findById(id).orElse(null);
    }
}
