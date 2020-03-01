package com.example.productserver.service;

import com.example.productserver.domain.Product;
import com.example.productserver.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Object findById(Long id) {
        return productRepository.findById(id);
    }
}
