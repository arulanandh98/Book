package com.commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.commerce.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

//	
//	@Query("SELECT EXISTS (SELECT * FROM User u WHERE u.usr = ?1 AND u.pas = ?2)")
//	public boolean login(String usr,String pas);
	
}
