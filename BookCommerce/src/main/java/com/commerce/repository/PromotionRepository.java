package com.commerce.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.commerce.model.Promotion;

@Repository
public interface PromotionRepository extends JpaRepository<Promotion, Long> {

	
//@Transactional
//@Query("select exists(select * from Promotion p where p.promocode =?1)")
//public boolean applyPromotion(String promoCode);
//	
	
}
