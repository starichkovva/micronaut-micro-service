package com.templatetasks.java.micronaut.controller;

import com.templatetasks.java.micronaut.service.SampleService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

/**
 * @author Vadim Starichkov (starichkovva@gmail.com)
 * @since 2022-09-09 17:59
 */
@Controller("/sample")
public class SampleController {

    @Inject
    private SampleService sampleService;

    @Get("/{name}")
    public String sampleGet(String name) {
        return String.join(":", name, sampleService.getSample());
    }
}
