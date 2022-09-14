package com.templatetasks.java.micronaut.service.impl;

/**
 * @author Vadim Starichkov
 * @since 14.09.2022 15:29
 */
public interface DataAccessService<T, ID> {

    T get(ID id);
}
