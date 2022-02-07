package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {
@Autowired
private ProductRepository productrepository;

public Product addproduct(Product product) {
	return productrepository.save(product);
	
}

public Product getById(Integer id) {
	return productrepository.findById(id).get();
}



}
