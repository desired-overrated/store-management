import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

/** scanner class is created and put through diffrent inputs
  */
    Scanner input = new Scanner(System.in);

    Cupcake bella = new Cupcake();

    System.out.println("----For Cupcake----");
    System.out.println();

    System.out.print("Price: ");
    double price = input.nextDouble();
    bella.setPrice(price);
    
    System.out.print("Amount: ");
    int quantity = input.nextInt();
    bella.setQuantity(quantity);

    System.out.print("Is Sweet?: ");
    boolean isSweet = input.nextBoolean();
    bella.setIsSweet(isSweet);

        System.out.print("Has Sprinkles: ");
    boolean hasSprinkles = input.nextBoolean();
    bella.setHasSprinkles(hasSprinkles);


    System.out.println();
    System.out.println("----FINAL----");
    System.out.println();
 System.out.println(bella);

    Boba p = new Boba();
    System.out.println();
  System.out.println("----For Boba----");
    System.out.println();

    System.out.print("Flavor: ");
    String flavor = input.next();
    p.setFlavor(flavor);

    System.out.println();
    System.out.println("----FINAL----");
    System.out.println();
    System.out.println(p);
    System.out.println();

    input.close();

    /** scanner class is closed
  */

    /** differnt value are tested in the constuctors made in eah sub-class
  */

    Cupcake b = new Cupcake();
    System.out.println("Price: " + price);
    System.out.println("Amount: " + quantity);
    System.out.println("Is Sweet: " + isSweet);
    System.out.println("has Sprinkles: " + hasSprinkles);
    System.out.println();

     Cupcake n = new Cupcake(3, 9.99, true, false);
    System.out.println("Price: " + price);
    System.out.println("Amount: " + quantity);
   System.out.println("Is Sweet: " + isSweet);
    System.out.println("has Sprinkles: " + hasSprinkles);
    System.out.println();

    Boba f = new Boba();
    System.out.println("Price: " + price);
    System.out.println("Amount: " + quantity);
    System.out.println("Is Sweet: " + isSweet);
    System.out.println("Flavor: " + flavor);
    System.out.println();

    Boba h = new Boba(2, 7.99, true, "strawberry");
    System.out.println("Price: " + price);
    System.out.println("Amount: " + quantity);
    System.out.println("Is Sweet: " + isSweet);
    System.out.println("Flavor: " + flavor);
    
  }
}