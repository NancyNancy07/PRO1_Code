import java.util.Scanner;
public class ChallengeThree
{
    public static void main(String[] args){
      Scanner salesTax = new Scanner(System.in);

      System.out.println("Item1 price?");
      double price1 = salesTax.nextDouble();

      System.out.println("Item2 price?");
      double price2 = salesTax.nextDouble();

      System.out.println("Item3 price?");
      double price3 = salesTax.nextDouble();

      System.out.println("Your sales tax (e.g. 0.25)?");
      double tax = salesTax.nextDouble();

      System.out.println("Item1 price: " +  tax * price1) ;
      System.out.println("Item2 price: " +  tax * price2) ;
      System.out.println("Item3 price: " +  tax * price3) ;



    }
}
