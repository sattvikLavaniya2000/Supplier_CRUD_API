package com.example.springboot.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springboot.demo.dao.SupplierDAO;
import com.example.springboot.demo.entity.Supplier;

@Service
public class SupplierServiceImpl implements SupplierService {
	
	private SupplierDAO supplierDAO;
	
	@Autowired
	public SupplierServiceImpl(SupplierDAO theSupplierDAO) {
		supplierDAO = theSupplierDAO;
	}

	@Override
	
	public List<Supplier> findAll() {
		
		return supplierDAO.findAll();
	}

	
	@Override
	
	public Supplier findById(int theId) {
		
		
		 return supplierDAO.findById(theId);
	}

	
	@Override
	
	public void save(Supplier theSupplier) {
		
		supplierDAO.save(theSupplier);
		
	}

	
	@Override
	
	public void deleteById(int theId) {
		supplierDAO.deleteById(theId);

	}

}
