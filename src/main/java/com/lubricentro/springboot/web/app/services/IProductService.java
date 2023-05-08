package com.lubricentro.springboot.web.app.services;

import java.util.List;

import com.lubricentro.springboot.web.app.domain.Product;

public interface IProductService {
	public List<Product> getAll();
}
