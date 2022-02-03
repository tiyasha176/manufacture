package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;

import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {
@Autowired
private ProductRepository productRepository;

public void addProduct(Product product) {
	productRepository.save(product);
}
	
}
