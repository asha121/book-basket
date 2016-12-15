package com.clean.books.books;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BookBasketShould {

	@Test
	public void return_price_for_one_copy_of_book() {
		BookBasket basket = new BookBasket(new Book("Harry Potter A",1));
		assertEquals(8, basket.getPrice(),0);
	}

}
