package dev.rvsiyad;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;

public class BasketTest {

  @Test
  public void
  test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded() {
    Basket basket = new Basket();
    List<Book> booksInBasket = basket.getBooksInBasket();
    assertEquals(0, booksInBasket.size());
  }

  @Test
  public void
  test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook() {
    Basket basket = new Basket();
    Book book = new Book(4.5);
    basket.addBook(book);
    List<Book> booksInBasket = basket.getBooksInBasket();
    assertEquals(1, booksInBasket.size());
  }

  @Test
  public void
  test_GetBooksInBasket_ReturnsArrayOfLengthTwo_AfterAddBookMethodIsCalledWithTwoBooks() {
    Basket basket = new Basket();
    Book book1 = new Book(2.2);
    Book book2 = new Book(2.5);
    basket.addBook(book1);
    basket.addBook(book2);
    List<Book> booksInBasket = basket.getBooksInBasket();
    assertEquals(2, booksInBasket.size());
  }


}
