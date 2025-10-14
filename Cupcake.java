public class Cupcake extends Bakery{

  private boolean hasSprinkles;

public Cupcake() {
    this(1, 7.99, false, false);
  }

  public Cupcake(int quantity, double price, boolean isSweet, boolean hasSprinkles){
  super(quantity, price, isSweet);
  this.hasSprinkles =  hasSprinkles;
}

  public boolean getHasSprinkles(){
  return hasSprinkles;
}

    public void setHasSprinkles(boolean hasSprinkles) {
    this.hasSprinkles = hasSprinkles;
  }

  public String toString(){
  return super.toString() + "\nHas Sprinkles: " + hasSprinkles;
    
}
  
}