package dev.rvsiyad;

import java.util.ArrayList;
import java.util.List;

public class Basket {

  private List<Book> basket;

  public Basket() {
    this.basket = new ArrayList<>();
  }

  public List<Book> getBooksInBasket() {
    return basket;
  }

  public void addBook(Book book) {
    basket.add(book);
  }

}
