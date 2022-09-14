package com.templatetasks.java.micronaut.data.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * @author Vadim Starichkov (starichkovva@gmail.com)
 * @since 14.09.2022 15:31
 */
@Entity
@Table(name = "customers")
public class Customer extends BaseEntity {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer", fetch = FetchType.LAZY)
    private Collection<Order> orders;

    public Collection<Order> getOrders() {
        return orders;
    }

    public void setOrders(Collection<Order> orders) {
        this.orders = orders;
    }
}
