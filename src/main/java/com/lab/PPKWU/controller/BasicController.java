package com.lab.PPKWU.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("/{text}")
    public String rev(@PathVariable String text) {
        String processedValue = new StringBuilder(text).reverse().toString();
        return processedValue;
    }

}
