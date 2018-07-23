package com.config1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Config1Application {

    public static void main(String[] args) {
        SpringApplication.run(Config1Application.class, args);
    }

    @Value("${server.port}")
    String foo;
    @GetMapping(value = "/hi")
    public String hi(){
        return "get--->"+foo;
    }
}
