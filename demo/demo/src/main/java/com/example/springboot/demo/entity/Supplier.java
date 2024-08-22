package com.example.springboot.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="supplier")
public class Supplier {
	
	//defining fields
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "supplier_id")
	private int supplier_id;
	
	@Column(name = "company_name")
	private String companyname;
	
	@Column(name = "website")
	private String website;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "nature_of_business")
	private String nature_of_business;
	
	@Column(name = "manufacturing_processes")
	private String manufacturing_processes;

	
	//defining constructor
	
	public Supplier() {
		
	}
	
	public Supplier(String companyname, String website, String location, String nature_of_business, String manufacturing_processes) {
		this.companyname = companyname;
		this.website = website;
		this.location = location;
		this.nature_of_business = nature_of_business;
		this.manufacturing_processes = manufacturing_processes;
	}

	
	//defing getter/setter
	public int getId() {
		return supplier_id;
	}

	public void setId(int supplier_id) {
		this.supplier_id = supplier_id;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {

		this.companyname = companyname;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getNature_of_business() {
		return nature_of_business;
	}

	public void setNature_of_business(String nature_of_business) {
		this.nature_of_business = nature_of_business;
	}
	
	public String getManufacturing_processes() {
		return manufacturing_processes;
	}

	public void setManufacturing_processes(String manufacturing_processes) {
		this.manufacturing_processes = manufacturing_processes;
	}

	
	//defining toString
	@Override
	public String toString() {
		return "Supplier [Supplier_id=" + supplier_id + ", companyname=" + companyname + ", website=" + website
				+ ", location=" + location + ", nature_of_business=" + nature_of_business + ", manufacturing_processes="
				+ manufacturing_processes + "]";
	}
	
	

	
	

}
