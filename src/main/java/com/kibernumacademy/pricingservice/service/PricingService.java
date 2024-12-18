package com.kibernumacademy.pricingservice.service;


import org.springframework.stereotype.Service;

import com.kibernumacademy.pricingservice.model.Price;
import com.kibernumacademy.pricingservice.repository.PricingRepository;

@Service
public class PricingService {

    private final PricingRepository pricingRepository;

    public PricingService(PricingRepository pricingRepository) {
        this.pricingRepository = pricingRepository;
    }

    // Busca el precio de un producto por su ID
    public Price getPriceByProductId(Long productId) {
        return pricingRepository.findByProductId(productId);
    }

    // Metodo para crear un precio
    public Price createPrice(Price price) {
        return pricingRepository.save(price);
    }
}