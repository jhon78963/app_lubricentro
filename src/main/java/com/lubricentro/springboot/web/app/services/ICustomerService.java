package com.lubricentro.springboot.web.app.services;

import java.util.List;

import com.lubricentro.springboot.web.app.domain.Customer;

public interface ICustomerService {
	public List<Customer> getAll();

    public void save(Customer customer);

    public Customer findOne(int id);

    public void delete(int id);

    public List<Customer> findByNombre(String term);

    public Customer findByID(int id);
    
    public Customer findCustomer(Customer customer);
}
