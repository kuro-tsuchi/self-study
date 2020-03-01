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

    @RequestMapping("getOne")
    public Product getOne(@RequestParam Long id) {
        System.out.println("hello");
        Product one = productService.getOne(id);
        System.out.println(one);
        return one;
    }
}
