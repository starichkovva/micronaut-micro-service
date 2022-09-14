package com.templatetasks.java.micronaut.service;

import com.templatetasks.java.micronaut.data.model.Customer;

/**
 * @author Vadim Starichkov (starichkovva@gmail.com)
 * @since 14.09.2022 15:25
 */
public interface CustomerService {

    Customer get(Long id);
}
