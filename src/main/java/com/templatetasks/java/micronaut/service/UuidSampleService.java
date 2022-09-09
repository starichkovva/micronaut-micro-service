package com.templatetasks.java.micronaut.service;

import io.micronaut.context.annotation.Primary;
import jakarta.inject.Singleton;

import java.util.UUID;

/**
 * @author Vadim Starichkov (starichkovva@gmail.com)
 * @since 2022-09-09 18:02
 */
@Primary
@Singleton
public class UuidSampleService implements SampleService {

    @Override
    public String getSample() {
        return UUID.randomUUID().toString();
    }
}
