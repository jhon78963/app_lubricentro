package com.lubricentro.springboot.web.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lubricentro.springboot.web.app.domain.Sale;

public interface SaleRepository extends JpaRepository<Sale, Integer>{

}
