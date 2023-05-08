package com.lubricentro.springboot.web.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lubricentro.springboot.web.app.domain.Product;
import com.lubricentro.springboot.web.app.repositories.ProductRepository;

@Service
public class ProductService implements IProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> getAll() {
		return (List<Product>) this.productRepository.findAll();
	}

}
