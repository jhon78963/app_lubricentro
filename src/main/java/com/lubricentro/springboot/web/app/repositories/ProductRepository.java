package com.lubricentro.springboot.web.app.repositories;

import org.springframework.data.repository.CrudRepository;

import com.lubricentro.springboot.web.app.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

}
