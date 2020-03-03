package com.commerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="promotion")
public class Promotion {
	
	@Id
	@Column(name="promo_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long promoId;
	private int discount;
	@Column(name="promo_code")
	private String promoCode;
	public Long getPromoId() {
		return promoId;
	}
	public void setPromoId(Long promoId) {
		this.promoId = promoId;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public String getPromoCode() {
		return promoCode;
	}
	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}
	
	@Override
	public String toString() {
		return "Promotion [promoId=" + promoId + ", discount=" + discount + ", promoCode=" + promoCode + "]";
	}
	public Promotion(Long promoId, int discount, String promoCode) {
		super();
		this.promoId = promoId;
		this.discount = discount;
		this.promoCode = promoCode;
	}
	public Promotion() {
		super();
	}
	
	
	

}
