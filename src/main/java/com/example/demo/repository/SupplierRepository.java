package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

 
import com.example.demo.entity.Supplier;

public interface SupplierRepository extends CrudRepository<Supplier, Integer> {

}
