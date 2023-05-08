package com.lubricentro.springboot.web.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lubricentro.springboot.web.app.domain.Customer;
import com.lubricentro.springboot.web.app.repositories.CustomerRepository;


@Service
public class CustomerService implements ICustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public List<Customer> getAll() {
		return (List<Customer>) this.customerRepository.findAll();
	}

	@Override
	public void save(Customer customer) {
		customerRepository.save(customer);
		
	}

	@Override
	public Customer findOne(int id) {
		return customerRepository.findById(id).orElse(null);
	}

	@Override
	public void delete(int id) {
		customerRepository.deleteById(id);
	}

	@Override
	public List<Customer> findByNombre(String term) {
		return customerRepository.findByNombreLikeIgnoreCase("%" + term + "%");
	}

	@Override
	public Customer findByID(int id) {
		return customerRepository.findById(id).orElse(null);
	}
	
	@Override
    @Transactional(readOnly = true)
    public Customer findCustomer(Customer customer) {
        return customerRepository.findById(customer.getCode()).orElse(null);
    }

}
