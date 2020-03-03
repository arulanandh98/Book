package com.commerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.commerce.model.Inventory;
import com.commerce.repository.InventoryRepository;

@Service
public class InventoryService {

	@Autowired
	private InventoryRepository inventoryRepository;
	
	public List<Inventory> getInventory()
	{
		return inventoryRepository.findAll(Sort.by("title"));
	}
	
	public Inventory getBook(Long bookId)
	{
		return inventoryRepository.findById(bookId).get();
	}
	
	public Inventory saveBooks(Inventory i)
	{
		return inventoryRepository.saveAndFlush(i);
		
	}
	
	
//	@Modifying
//	@Query("update Inventory i set i.title = ?1, i.author =?2 , i.price=?3 where i.bookId=4?")
//	void editBook(String title, String author, int price, Long bookId)
//	{
//		
//	}
//	
	
	
	
	
	
	
	public void edit(String title, String author, int price,int quantity, Long bookId)
	{
	inventoryRepository.editBook(title,author,price,quantity,bookId);
	}
	
	
//	public void edit(Inventory i)
//	{
//		inventoryRepository.editBook(i);
//	}
//	
	
	
//	//THIS WORKS!!!
//	public void editTitle(String title, Long bookId)
//	{
//		inventoryRepository.editBookTitle(title, bookId);
//	}
	
	//Works
	public void editAuthor(String author,Long bookId)
	{
		inventoryRepository.editBookAuthor(author, bookId);
	}
	
}
