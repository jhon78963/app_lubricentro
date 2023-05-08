package com.lubricentro.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.lubricentro.springboot.web.app.services.ICustomerService;

import org.springframework.ui.Model;

@Controller
public class SaleController {
	
	private ICustomerService customerService;
	//private IProductService productService;
	//private ISaleService saleService;
	
	@GetMapping("/guardar")
    public String getAll(Model model) {
		model.addAttribute("customers", customerService.getAll());
		//model.addAttribute("products", productService.getAll());
		//model.addAttribute("ventaRequest", new SaleDto());
        //Sale sale = saleDto.getSale();
        //List<SaleDetail> saleDetails = saleDto.getSaleDetail();
        //Sale ventaGuardada = saleService.guardarVenta(sale, saleDetails);
        return "sales";
    }
}
