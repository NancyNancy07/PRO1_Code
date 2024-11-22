public class ChallengeFive
{
  public static void main(String[] args){
    double salesTax = 0.25;
    int item1 = 80;
    int item2 = 140;
    int item3 = 230;

    double item1Tax= item1 * salesTax;
    double item2Tax= item2 * salesTax;
    double item3Tax= item3 * salesTax;

    double item1Price = item1+item1Tax ;
    double item2Price = item2+item2Tax;
    double item3Price =item3+item3Tax ;
    //System.out.println("Total Price: " + (totalPrice));
    System.out.println("Item1 : " + item1Price);
    System.out.println("Item2 : " + item2Price);
    System.out.println("Item3 : " + item3Price);
    System.out.println("Total Price : " + (item1Price + item2Price+ item3Price));
  }
}
