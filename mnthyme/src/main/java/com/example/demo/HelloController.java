package com.example.demo;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.views.View;

@Controller
public class HelloController {

    @View("hello")
    @Get("/")
    public HttpResponse index() {
        return HttpResponse.ok();
    }

    @View("hello")
    @Get("/sample")
    public HttpResponse sample() {
        return HttpResponse.ok();
    }
}
