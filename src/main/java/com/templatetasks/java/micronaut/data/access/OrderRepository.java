package com.templatetasks.java.micronaut.data.access;

import com.templatetasks.java.micronaut.data.model.Order;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

/**
 * @author Vadim Starichkov (starichkovva@gmail.com)
 * @since 14.09.2022 16:35
 */
@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
}
