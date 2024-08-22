package com.example.springboot.demo.service;

import java.util.List;

import com.example.springboot.demo.entity.Supplier;

public interface SupplierService {
	
	public List<Supplier> findAll();
	
	public Supplier findById(int theId);
	
	public void save(Supplier theSupplier);
	
	public void deleteById(int theId);
	

}
