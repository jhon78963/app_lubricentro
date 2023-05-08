package com.lubricentro.springboot.web.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lubricentro.springboot.web.app.domain.Customer;


public interface CustomerRepository extends JpaRepository<Customer,Integer>{
	public List<Customer> findByNombreLikeIgnoreCase(String term);
}
