package com.kibernumacademy.pricingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kibernumacademy.pricingservice.model.Price;

@Repository
public interface PricingRepository extends JpaRepository<Price, Long> {
    // Busca el precio asociado a un producto específico
    Price findByProductId(Long productId);
}