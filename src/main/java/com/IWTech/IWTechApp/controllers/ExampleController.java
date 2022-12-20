package com.IWTech.IWTechApp.controllers;

import com.IWTech.IWTechApp.model.Example;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController
{

    private static final String template = "Hello, %s!";

    @GetMapping("/greeting")
    public Example example(@RequestParam(value = "name", defaultValue = "World") String name)
    {
        return new Example(1, String.format(template, name));
    }
}
