package com.clean.books.books;

public class BookBasket {

	private Book book;

	public BookBasket(Book book) {
		super();
		this.book = book;
	}

	public double getPrice() {
		if (book.getQuantity() == 1) {
			return 8;
		}
		return 0;
	}

}
