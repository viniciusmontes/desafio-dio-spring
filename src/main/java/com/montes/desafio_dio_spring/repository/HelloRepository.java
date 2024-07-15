package com.montes.desafio_dio_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.montes.desafio_dio_spring.entities.Hello;

@Repository
public interface HelloRepository extends JpaRepository<Hello, Long>{
    
}
