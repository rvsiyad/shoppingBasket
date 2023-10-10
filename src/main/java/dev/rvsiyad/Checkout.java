package dev.rvsiyad;

public class Checkout {

  public Checkout(Basket basket) {
  }

  public double calculatePrice(Basket basket) {
    double totalPrice = 0.0;
    int numberOfBooks = basket.getBooksInBasket().size();
    int totalDiscount = 0;
    
    for(Book book: basket.getBooksInBasket()) {
      totalPrice += book.getPrice();
    }
    
    if(numberOfBooks >= 10) {
      int remainderForTen = numberOfBooks % 10;
      int calculateDiscountTenBooks = (numberOfBooks - remainderForTen) / 10;
      totalDiscount = calculateDiscountTenBooks * 10;
    }

    if(numberOfBooks >= 3) {
      int remainderForThree = numberOfBooks % 3;
      int calculateDiscountThreeBooks = (numberOfBooks - remainderForThree) / 3;
      totalDiscount += calculateDiscountThreeBooks;
      
      double newTotalPrice = totalPrice * (1 - ((double)totalDiscount/100));
      return newTotalPrice;
    } else {
      return totalPrice;
    }
  }

}
