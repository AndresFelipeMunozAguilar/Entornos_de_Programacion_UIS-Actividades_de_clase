package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DummyController {

    @RequestMapping("/greetings/{name}")
    public String helloWorld(@PathVariable String name) {
        return "Hello, " + name;
    }

}
