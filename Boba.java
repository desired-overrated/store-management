public class Boba extends Bakery{

    private String flavor;

  public Boba() {
    this(1, 8.99, false, "Mango");
  }

  public Boba(int quantity, double price, boolean isSweet, String flavor){
  super(quantity, price, isSweet);
  this.flavor =  flavor;
}

    public String getFlavor(){
  return flavor;
}

   public void setFlavor(String flavor) {
    this.flavor = flavor;
  }

  public String toString(){
  return super.toString() + "\nFlavor: " + flavor;
    
}
  
}