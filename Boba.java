public class Boba extends Bakery{

    private String flavor;

  /* constructors
  */
  public Boba() {
    this(1, 8.99, false, "Mango");
  }

  public Boba(int quantity, double price, boolean isSweet, String flavor){
  super(quantity, price, isSweet);
  this.flavor =  flavor;
}

  /* get method
  */
    public String getFlavor(){
  return flavor;
}

  /* set method
  */
   public void setFlavor(String flavor) {
    this.flavor = flavor;
  }

  /* adds to the toString in the bakery
  */
  public String toString(){
  return super.toString() + "\nFlavor: " + flavor;
    
}
  
}