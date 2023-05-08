package com.lubricentro.springboot.web.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lubricentro.springboot.web.app.domain.Sale;
import com.lubricentro.springboot.web.app.domain.SaleDetail;
//import com.lubricentro.springboot.web.app.repositories.SaleDetailRepository;
import com.lubricentro.springboot.web.app.repositories.SaleRepository;

@Service
public class SaleService implements ISaleService {

	@Autowired
	private SaleRepository saleRepository;

	//@Autowired
	//private SaleDetailRepository saleDetailRepository;
	
	List<SaleDetail> detalles = new ArrayList<SaleDetail>();

	Sale sale = new Sale();

	@Override
	public List<Sale> listarVentas() {
		 return (List<Sale>) saleRepository.findAll();
	}

	@Override
	public void save(Sale sale) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Sale findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
}
