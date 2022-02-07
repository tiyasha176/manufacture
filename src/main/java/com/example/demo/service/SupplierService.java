package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Supplier;
import com.example.demo.repository.SupplierRepository;

@Service
public class SupplierService {
	@Autowired
	private SupplierRepository supplierRepository;
	
	public Supplier addsupplier(Supplier supplier) {
		return supplierRepository.save(supplier);
	}
	
	public Supplier getById(Integer id) {
		return supplierRepository.findById(id).get();
	}
	

}
