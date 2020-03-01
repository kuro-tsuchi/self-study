package com.example.productserver.service;

import com.example.productserver.domain.Product;
import com.example.productserver.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product getOne(Long id) {
        return productRepository.getOne(id);
    }
}
