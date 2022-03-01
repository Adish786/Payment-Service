package com.common.retail.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PAYMENT_TBL")
public class Payment {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String paymentserviceprovider;
	private int totalpayout;
	private int quantity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPaymentserviceprovider() {
		return paymentserviceprovider;
	}
	public void setPaymentserviceprovider(String paymentserviceprovider) {
		this.paymentserviceprovider = paymentserviceprovider;
	}
	public int getTotalpayout() {
		return totalpayout;
	}
	public void setTotalpayout(int totalpayout) {
		this.totalpayout = totalpayout;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Payment [id=" + id + ", paymentserviceprovider=" + paymentserviceprovider + ", totalpayout="
				+ totalpayout + ", quantity=" + quantity + "]";
	}
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
