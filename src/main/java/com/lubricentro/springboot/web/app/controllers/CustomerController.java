package com.lubricentro.springboot.web.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lubricentro.springboot.web.app.domain.Customer;
import com.lubricentro.springboot.web.app.services.ICustomerService;

import jakarta.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Map;
import java.util.List;

@Controller
public class CustomerController {
	@Autowired
    private ICustomerService customerService;
	
	@GetMapping(value = {"/customer/","/customer","/customer/save"})
    public String index(Map<String, Object> model) {
        Customer customer = new Customer();
        model.put("customer",customer);
        model.put("titulo", "Listado de clientes");
        model.put("customers", customerService.getAll());
        return "customer/index";
    }
	
	@RequestMapping(value = "/customer/save", method = RequestMethod.POST)
    public String guardar(@Valid Customer customer, BindingResult result, Model model, SessionStatus status) {
        if(result.hasErrors()) {
            model.addAttribute("customer",customer);
            model.addAttribute("titulo", "Listado de clientes");
            model.addAttribute("customers", customerService.getAll());
            return "customer/index";
        }

        customerService.save(customer);
        status.setComplete();
        return "redirect:/customer";
    }
	
	@GetMapping("/customer/editar/{code}")
    public String editar(Customer customer, Model model){
        customer = customerService.findCustomer(customer);
        model.addAttribute("titulo", "Editar cliente");
        model.addAttribute("customer", customer);
        return "customer/edit";
    }
	
	@RequestMapping(value="/customer/eliminar/{id}")
    public String eliminar(@PathVariable(value="id") int id) {

        if(id > 0) {
        	customerService.delete(id);
        }
        return "redirect:/customer";
    }

    @GetMapping(value = "/customer/cargar-customers/{term}", produces = { "application/json" })
    public @ResponseBody List<Customer> cargarCustomers(@PathVariable String term) {

        return customerService.findByNombre(term);
    }
}
