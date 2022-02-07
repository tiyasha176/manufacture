package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Supplier;
import com.example.demo.service.SupplierService;
@RestController
public class SupplierController {
	@Autowired
	private SupplierService supplierservice;
	@PostMapping("/supplier")
	
	public String addsupplier(@RequestBody Supplier supplier) {
		supplierservice.addsupplier(supplier);
		return "supplier added";
	}
	//find by id
		@GetMapping("/supplier{id}")
		public Supplier getById(@PathVariable Integer id) {
			return supplierservice.getById(id);
		}

}
