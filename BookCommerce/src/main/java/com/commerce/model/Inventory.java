package com.commerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//check inventory db name
@Entity
@Table(name="inventory")
public class Inventory {

	@Id
	@Column(name="book_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long bookId;
	private String title;
	private String author;
	private int price;
	private int quantity;
	
	
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Inventory(Long bookId, String title, String author, int price, int quantity) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}
	public Inventory() {
		super();
	}
	@Override
	public String toString() {
		return "Inventory [bookId=" + bookId + ", title=" + title + ", author=" + author + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	

	
	
	
}
