package com.kibernumacademy.pricingservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kibernumacademy.pricingservice.model.Price;
import com.kibernumacademy.pricingservice.service.PricingService;

// Controlador PricingController - Expone los endpoints del servicio de precios

@RestController
@RequestMapping("/prices")
public class PricingController {

    private final PricingService pricingService;

    public PricingController(PricingService pricingService) {
        this.pricingService = pricingService;
    }

    // Obtiene el precio de un producto por su ID
    @GetMapping("/{productId}")
    public ResponseEntity<Price> getPrice(@PathVariable Long productId) {
        Price price = pricingService.getPriceByProductId(productId);
        if (price == null) {
            return ResponseEntity.notFound().build(); // Retorna 404 si no se encuentra el precio
        }
        return ResponseEntity.ok(price); // Retorna el precio encontrado
    }

    // Metodo para crear un precio
    @PostMapping
    public ResponseEntity<Price> createPrice(@RequestBody Price price) {
        Price createdPrice = pricingService.createPrice(price);
        return ResponseEntity.ok(createdPrice); // Retorna el precio creado
    }
}