package com.hoangit3.firstspringbootapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class HelloController {
    @GetMapping(path = "hello")
    public String sayHello() {
        return "Hello Hoang Anh";
    }

    @GetMapping(path = "goodbye")
    public String sayGoodbye() {
        return "Goodbye Anh Hoang";
    }
}
