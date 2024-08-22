package com.example.springboot.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.demo.entity.Supplier;
import com.example.springboot.demo.service.SupplierService;

@RestController
@RequestMapping("/api")
public class SupplierRestController {
	
	private SupplierService supplierService;
	
	@Autowired
	public SupplierRestController(SupplierService theSupplierService) {
		supplierService = theSupplierService;
	}
	
	@GetMapping("/supplier")
	public List<Supplier> findAll(){

		return supplierService.findAll();
	}
	
	@GetMapping("/supplier/{supplierId}")
	public Supplier getSupplier(@PathVariable int supplierId) {
		
		Supplier theSupplier = supplierService.findById(supplierId);
		
		if(theSupplier == null) {
			throw new RuntimeException("Supplier id not found-" + supplierId);
		}
		 return theSupplier;
	}
	
	@PostMapping("/supplier/{supplierId}")
	public Supplier addSupplier(@RequestBody Supplier theSupplier) {
		theSupplier.setId(0);
		
		supplierService.save(theSupplier);
		
		return theSupplier;
	}
	
	@PutMapping("/supplier")
	public Supplier updateSupplier(@RequestBody Supplier theSupplier) {
		supplierService.save(theSupplier);
		
		return theSupplier;
	}


	
	@DeleteMapping("/supplier/{supplierId}")
	public String deleteSupplier(@PathVariable int supplierId) {
		
		Supplier tempSupplier = supplierService.findById(supplierId);
		
		if(tempSupplier == null) {
			throw new RuntimeException("Supplier Id not found - " + supplierId);
		}
		
		supplierService.deleteById(supplierId);
		
		return "Deleted supplier id - " + supplierId;
	}

}
