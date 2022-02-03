package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;



public class ProductController {
	@Autowired
	private ProductService productservice;
	@PostMapping("/product")
	@ResponseStatus(code = HttpStatus.CREATED)
	void addDetails(@RequestBody Product product) {
		productservice.addProduct(product);
	}
	


}

