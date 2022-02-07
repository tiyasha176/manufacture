package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController

public class ProductController {
	@Autowired
	private ProductService productservice;
	
	//product added
	@PostMapping("/product")
	public String addproduct(@RequestBody Product product) {
		productservice.addproduct(product);
		return "product added";	
	}
	//find by id
	@GetMapping("/product{id}")
	public Product getById(@PathVariable Integer id) {
		return productservice.getById(id);
	}

	}	
		
		
		
		




