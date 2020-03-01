package com.example.productserver.controller;

import com.example.productserver.domain.Product;
import com.example.productserver.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product/v1")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("findById")
    public Object findById(@RequestParam Long id) {
        return productService.findById(id);
    }
}
