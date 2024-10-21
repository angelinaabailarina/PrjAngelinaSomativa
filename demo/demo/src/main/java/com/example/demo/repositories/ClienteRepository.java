package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Product;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
