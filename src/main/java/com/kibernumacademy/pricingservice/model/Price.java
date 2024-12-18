package com.kibernumacademy.pricingservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="prices")
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Genera IDs automáticamente
    private Long id; // ID único del precio
    private Long productId; // ID del producto asociado
    private double price; // Precio del producto

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}