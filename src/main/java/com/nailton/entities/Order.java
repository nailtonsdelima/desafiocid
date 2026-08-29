package com.nailton.entities;

public class Order {
	
	private String code;
	private Double basic;
	private Double discount;
	
	public Order() {
	}
	
	public Order(String code, double basic) {
		this.code = code;
		this.basic = basic;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Double getBasic() {
		return basic;
	}
	public void setBasic(Double basic) {
		this.basic = basic;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}

}
