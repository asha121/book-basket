package com.clean.books.books;

public class Book {
	private String title="Harry Potter A";
	private int quantity=1;
	public Book(String title, int quantity) {
		super();
		this.title = title;
		this.quantity = quantity;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
