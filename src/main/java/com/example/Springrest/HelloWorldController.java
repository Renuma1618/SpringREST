package com.example.Springrest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    //http requests here
    //http://localhost:8080/hello
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }
}
