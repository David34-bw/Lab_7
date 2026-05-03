package com.example.lab_7.services;

import com.example.lab_7.models.Competitor;
import com.example.lab_7.models.Product;
import com.example.lab_7.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findByProductIsNotNull()
                .stream()
                .map(Competitor::getProduct)
                .collect(Collectors.toList());
    }
}