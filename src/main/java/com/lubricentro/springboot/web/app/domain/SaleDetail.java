package com.lubricentro.springboot.web.app.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "saleDetails")
public class SaleDetail {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
	private Product produt;
	
	@ManyToOne
	@JoinColumn(name = "sale_id", nullable = false)
	private Sale sale;
	
	private int quantity;
	private double unitPrice;
	
	public SaleDetail() {
		super();
	}
	
	public SaleDetail(int id, Product produt, Sale sale, int quantity, double unitPrice) {
		super();
		this.id = id;
		this.produt = produt;
		this.sale = sale;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}
	
	public SaleDetail(Product produt, Sale sale, int quantity, double unitPrice) {
		super();
		this.produt = produt;
		this.sale = sale;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Product getProdut() {
		return produt;
	}
	public void setProdut(Product produt) {
		this.produt = produt;
	}
	public Sale getSale() {
		return sale;
	}
	public void setSale(Sale sale) {
		this.sale = sale;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

}
