package com.lubricentro.springboot.web.app.dto;

import java.util.List;

import com.lubricentro.springboot.web.app.domain.Sale;
import com.lubricentro.springboot.web.app.domain.SaleDetail;

public class SaleDto {
	private Sale sale;
    private List<SaleDetail> saleDetail;
	public SaleDto(Sale sale, List<SaleDetail> saleDetail) {
		super();
		this.sale = sale;
		this.saleDetail = saleDetail;
	}
	public SaleDto() {
		super();
	}
	public Sale getSale() {
		return sale;
	}
	public void setSale(Sale sale) {
		this.sale = sale;
	}
	public List<SaleDetail> getSaleDetail() {
		return saleDetail;
	}
	public void setSaleDetail(List<SaleDetail> saleDetail) {
		this.saleDetail = saleDetail;
	}
}
