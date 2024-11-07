package com.tomas.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tomas.example.entity.Product;

public interface ProductoRepository extends JpaRepository<Product,Long>{ }