package com.example.springboot.demo.dao;


import java.util.List;

import com.example.springboot.demo.entity.Supplier;


public interface SupplierDAO {
	
	public List<Supplier> findAll();
	
	public Supplier findById(int theId);
	
	public void save(Supplier theSupplier);
	
	public void deleteById(int theId);

	
}
