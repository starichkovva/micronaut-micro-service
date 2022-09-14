package com.templatetasks.java.micronaut.service;

import com.templatetasks.java.micronaut.data.model.Order;

/**
 * @author Vadim Starichkov (starichkovva@gmail.com)
 * @since 14.09.2022 15:25
 */
public interface OrderService {

    Order get(Long id);
}
