package dev.rvsiyad;

import java.util.ArrayList;
import java.util.List;

public class Basket {

  List<Book> basket = new ArrayList<Book>();

  public List<Book> getBooksInBasket() {
    return basket;
  }

  public void addBook(Book book) {
    basket.add(book);
  }

}
