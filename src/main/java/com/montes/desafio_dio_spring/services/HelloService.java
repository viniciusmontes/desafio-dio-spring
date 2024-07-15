package com.montes.desafio_dio_spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montes.desafio_dio_spring.entities.Hello;
import com.montes.desafio_dio_spring.repository.HelloRepository;

@Service
public class HelloService {

    @Autowired
    HelloRepository helloRepository;

    public void inserir(String message) {
        Hello h1 = new Hello(1l, message);
        helloRepository.save(h1);
    }

    public List<Hello> buscarTodos() {
        inserir("Olá mundo!");
        return helloRepository.findAll();
    }

}
