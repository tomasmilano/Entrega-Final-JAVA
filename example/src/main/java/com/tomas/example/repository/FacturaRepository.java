package com.tomas.example.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.tomas.example.entity.Factura;

public interface FacturaRepository extends JpaRepository<Factura, Long> {
}