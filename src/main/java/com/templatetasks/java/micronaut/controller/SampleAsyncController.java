package com.templatetasks.java.micronaut.controller;

import com.templatetasks.java.micronaut.service.SampleService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;
import jakarta.inject.Inject;

/**
 * @author Vadim Starichkov (starichkovva@gmail.com)
 * @since 2022-09-09 17:59
 */
@Controller("/async/sample")
@ExecuteOn(TaskExecutors.IO)
public class SampleAsyncController {

    @Inject
    private SampleService sampleService;

    @Get("/{name}")
    public String sampleGet(String name) {
        return String.join(":", name, sampleService.getSample());
    }
}
