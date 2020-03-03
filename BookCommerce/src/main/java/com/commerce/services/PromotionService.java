package com.commerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commerce.model.Promotion;
import com.commerce.repository.PromotionRepository;


@Service
public class PromotionService {

	@Autowired
	private PromotionRepository promotionRepository;
	
	
	public Promotion addPromotion(Promotion info)
	{
		return promotionRepository.saveAndFlush(info);
	}
	
	public List<Promotion> getPromo()
	{
		return promotionRepository.findAll();
	}
	
	
	
	
//	public boolean applyPromotion(String promoCode)
//	{
//		return promotionRepository.applyPromotion(promoCode);
//	}
	
	
}
