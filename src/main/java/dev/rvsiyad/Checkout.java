package dev.rvsiyad;

public class Checkout {

  public Checkout(Basket basket) {
  }

  public double calculatePrice(Basket basket) {
    double totalPrice = 0.0;
    int numberOfBooks = basket.getBooksInBasket().size();
    int remainder = numberOfBooks % 3;
    int calculateDiscount = (numberOfBooks - remainder) / 3;
    
    for(Book book: basket.getBooksInBasket()) {
      totalPrice += book.getPrice();
    }

    if(numberOfBooks >= 3) {
      // int discountPercent = numberOfBooks / 3;
      double newTotalPrice = totalPrice * (1 - ((double)calculateDiscount/100));
      return newTotalPrice;
    } else {
      return totalPrice;
    }
  }

}
