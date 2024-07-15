package com.montes.desafio_dio_spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.montes.desafio_dio_spring.entities.Hello;
import com.montes.desafio_dio_spring.services.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    HelloService service;

    @GetMapping
    public ResponseEntity<List<Hello>> findAll() {
        List<Hello> result = service.buscarTodos();
        return ResponseEntity.ok().body(result);
    }

}
