package dev.rvsiyad;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CheckoutTest {

  @Test
  public void
  test_CalculatePrice_ReturnDoubleZeroPointZero_WhenPassedAnEmptyBasket() {
    Basket basket = new Basket();
    Checkout checkout = new Checkout(basket);
    double totalPrice = checkout.calculatePrice(basket);
    assertEquals(0.0, totalPrice, 0.0);
  }

  @Test
  public void
  test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithOneBook() {
    Basket basket = new Basket();
    Checkout checkout = new Checkout(basket);
    Book book = new Book(5.5);
    basket.addBook(book);
    double totalPrice = checkout.calculatePrice(basket);
    assertEquals(5.5, totalPrice);
  }

  @Test
  public void
  test_CalculatePrice_ReturnsPriceOfTwoBooksInBasket_WhenPassedBasketWithTwoBooks() {
    Basket basket = new Basket();
    Checkout checkout = new Checkout(basket);
    Book book1 = new Book(5.5);
    Book book2 = new Book(2.5);
    basket.addBook(book1);
    basket.addBook(book2);
    double totalPrice = checkout.calculatePrice(basket);
    assertEquals(8.0, totalPrice);
  }

  @Test
  public void
  test_CalculatePrice_ReturnsPriceOfThreeBooksInBasketWithOnePercentDiscount_WhenPassedBasketWithThreeBooks() {
    Basket basket = new Basket();
    Checkout checkout = new Checkout(basket);
    Book book1 = new Book(5);
    Book book2 = new Book(5);
    Book book3 = new Book(5);
    basket.addBook(book1);
    basket.addBook(book2);
    basket.addBook(book3);
    double totalPrice = checkout.calculatePrice(basket);
    assertEquals(14.85, totalPrice, 0.01);
  }

  @Test
  public void
  test_CalculatePrice_ReturnsPriceOfSevenBooksInBasketWithTwoPercentDiscount_WhenPassedBasketWithSevenBooks() {
    Basket basket = new Basket();
    Checkout checkout = new Checkout(basket);
    Book book1 = new Book(1);
    Book book2 = new Book(1);
    Book book3 = new Book(1);
    Book book4 = new Book(1);
    Book book5 = new Book(1);
    Book book6 = new Book(1);
    Book book7 = new Book(1);
    basket.addBook(book1);
    basket.addBook(book2);
    basket.addBook(book3);
    basket.addBook(book4);
    basket.addBook(book5);
    basket.addBook(book6);
    basket.addBook(book7);
    double totalPrice = checkout.calculatePrice(basket);
    assertEquals(6.86, totalPrice , 0.01);
  }

  @Test
  public void
  test_CalculatePrice_ReturnsPriceOfTenBooksInBasketWithThreePercentDiscountWithExtraTenPercentDiscountAdded_WhenPassedBasketWithTenBooks() {
    Basket basket = new Basket();
    Checkout checkout = new Checkout(basket);
    Book book1 = new Book(1);
    Book book2 = new Book(1);
    Book book3 = new Book(1);
    Book book4 = new Book(1);
    Book book5 = new Book(1);
    Book book6 = new Book(1);
    Book book7 = new Book(1);
    Book book8 = new Book(1);
    Book book9 = new Book(1);
    Book book10 = new Book(1);
    basket.addBook(book1);
    basket.addBook(book2);
    basket.addBook(book3);
    basket.addBook(book4);
    basket.addBook(book5);
    basket.addBook(book6);
    basket.addBook(book7);
    basket.addBook(book8);
    basket.addBook(book9);
    basket.addBook(book10);
    double totalPrice = checkout.calculatePrice(basket);
    assertEquals(8.7, totalPrice , 0.01);
  }
}
