package com.lubricentro.springboot.web.app.services;

import java.util.List;

import com.lubricentro.springboot.web.app.domain.Sale;

public interface ISaleService {
	public List<Sale> listarVentas();
	public void save(Sale sale);
    public Sale findOne(Long id);
    public void delete(Long id);
}
