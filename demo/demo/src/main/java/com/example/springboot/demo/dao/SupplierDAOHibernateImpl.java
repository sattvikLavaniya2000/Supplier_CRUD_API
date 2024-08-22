package com.example.springboot.demo.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.springboot.demo.entity.Supplier;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;


@Repository
public class SupplierDAOHibernateImpl implements SupplierDAO {
	
	//define field for entitymanager
	private EntityManager entityManager;
	
	//setup constructor injection
	@Autowired
	public SupplierDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	@Transactional
	public List<Supplier> findAll() {


		
		//get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		//create a query
		Query<Supplier> theQuery = currentSession.createQuery("from Supplier", Supplier.class);
		
		//execute query and get result list
		List<Supplier> supplier = theQuery.getResultList();
		
		// return the results
		return supplier;
	}

	@Override
	@Transactional
	public Supplier findById(int theId) {
		
		//get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		//get the employee
		Supplier theSupplier = currentSession.get(Supplier.class, theId);
		
		//return the employee
		return theSupplier;
	}


	@Override
	@Transactional
	public void save(Supplier theSupplier) {
		//get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		//save the employee
		currentSession.saveOrUpdate(theSupplier);
		
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		
		//get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		//delete object with primary key
		Query theQuery = currentSession.createQuery("delete from Supplier where id =: supplierId");
		theQuery.setParameter("supplierId", theId);
		theQuery.executeUpdate();
	
	}

}

