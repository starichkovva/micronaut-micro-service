package com.templatetasks.java.micronaut.controller;

import com.templatetasks.java.micronaut.service.SampleService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;

/**
 * @author Vadim Starichkov (starichkovva@gmail.com)
 * @since 2022-09-09 17:59
 */
@Controller("/async/sample")
public class SampleAsyncController {

    @Inject
    private SampleService sampleService;

    @Get("/{name}")
    public Mono<String> sampleGet(String name) {
        return Mono.just(String.join(":", name, sampleService.getSample()));
    }
}
