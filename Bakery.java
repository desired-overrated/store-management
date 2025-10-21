public class Bakery{

  private double price;
  private int quantity;
  private boolean isSweet;


   public Bakery(){
  quantity = 1;
  price = 0.0;
  isSweet = false;
}

  public Bakery(int quantity, double price, boolean isSweet) {
    this.quantity = quantity;
    this.price = price;
    this.isSweet = isSweet;
  }

  public double getPrice(){
  return price;
}
  public int getQuantity(){
  return quantity;
}
  public boolean getIsSweet(){
  return isSweet;
}

   public void setIsSweet(boolean isSweet) {
    this.isSweet = isSweet;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
  
  public void setPrice(double price) {
    // Should not set a price to be lower than 0.0
    if (price < 0.0) {
      this.price = 0.0;
    } else {
      this.price = price;
    }
  }

  /* creates what will be displayed once all the information is inputted
  */
  
  
  
  public String toString(){
  return "Price: " + price + "\nAmount: " + quantity + "\nIs Sweet?: " + isSweet;
    
}
  
}