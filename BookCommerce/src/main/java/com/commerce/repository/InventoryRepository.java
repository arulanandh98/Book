package com.commerce.repository;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;




import com.commerce.model.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {

	@Transactional
	@Modifying
	@Query("update Inventory i set i.title = ?1, i.author =?2 , i.price=?3, i.quantity=?4 where i.bookId=?5")
	void editBook(String title, String author, int price,int quantity, Long bookId);

//	@Modifying
//	@Query("update Inventory i set i.title = ?1, i.author =?2 , i.price=?3, i.quantity=?4 where i.bookId=?5")
//	void editBook(Inventory i);
	
	
//	//THIS WORKS!!!!
//	@Transactional
//	@Modifying
//	@Query("update Inventory i set i.title = ?1 where i.bookId=?2")
//	void editBookTitle(String title,Long bookId);
	
	
	//Works
	@Transactional
	@Modifying
	@Query("update Inventory i set i.author =?1 where i.bookId=?2")
	void editBookAuthor(String author,Long bookId);
	
}
