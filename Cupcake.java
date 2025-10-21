public class Cupcake extends Bakery{

  private boolean hasSprinkles;

  /* the constructors
  */
public Cupcake() {
    this(1, 7.99, false, false);
  }

  public Cupcake(int quantity, double price, boolean isSweet, boolean hasSprinkles){
  super(quantity, price, isSweet);
  this.hasSprinkles =  hasSprinkles;
}

  /* get function
  */
  public boolean getHasSprinkles(){
  return hasSprinkles;
}

  /* set function
  */
    public void setHasSprinkles(boolean hasSprinkles) {
    this.hasSprinkles = hasSprinkles;
  }

  /* adds on to the toString from the Bakery class
    */
  public String toString(){
  return super.toString() + "\nHas Sprinkles: " + hasSprinkles;
    
}
  
}