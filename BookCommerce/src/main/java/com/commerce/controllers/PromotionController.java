package com.commerce.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.commerce.model.Promotion;
import com.commerce.services.PromotionService;



@RestController
@RequestMapping("/promotion")
public class PromotionController {
	
	@Autowired
	private PromotionService promotionService;
	
	@PostMapping("/add")
	public Promotion addPromo(@RequestBody Promotion info)
	{
		return promotionService.addPromotion(info);
	}

	
	@GetMapping("/get")
	public List<Promotion> getPromo()
	{
		return promotionService.getPromo();
	}
}
