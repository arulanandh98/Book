package com.commerce.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.commerce.model.Inventory;
import com.commerce.repository.InventoryRepository;
import com.commerce.services.InventoryService;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
	
	@Autowired
	private InventoryService inventoryService;
	//private InventoryRepository inventoryRepository;
	
	
	@PostMapping("/edit/{ti}/{auth}/{price}/{q}/{bid} ")
	void editBook(@PathVariable ("ti")String title,@PathVariable ("auth") String author,@PathVariable ("price") int price,@PathVariable ("q") int quantity, @PathVariable ("bid") Long bookId)
	{
		inventoryService.edit(title, author, price,quantity, bookId);
	}
	
	
	
//	//THIS WORKS!!!
//	@PutMapping("/edit/{a}/{b}")
//	void editTitle(@PathVariable ("a")String title, @PathVariable ("b") Long bookId)
//	{
//		inventoryService.editTitle(title,bookId);
//	}
//	
	
	
	//works
	@PutMapping("/edit/{a}/{b}")
	void editAuthor(@PathVariable ("a")String author,@PathVariable("b") Long bookId)
	{
		inventoryService.editAuthor(author, bookId);
	}
	
	
	
	
	
	
	
	@GetMapping("/allinventory")
	public List<Inventory> getInventory()
	{
		return inventoryService.getInventory();
		
	}
	
	@GetMapping("/one/{bid}")
	public Inventory getBook(@PathVariable ("bid") Long bookId)
	{
		return inventoryService.getBook(bookId);
	}
	
	@PostMapping("/add")
	public Inventory saveBooks(@RequestBody Inventory i)
	{
		return inventoryService.saveBooks(i);
	}
}
