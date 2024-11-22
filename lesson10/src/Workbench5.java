public class Workbench5
{
  public static void main(String[] args)
  {

    double total = 0.0;
    int lastDigit = 30;
    for (int i = 1; i <= lastDigit; i++)
    {
      double fraction = (double) i / (lastDigit - i + 1);

      total += fraction;
    }
    System.out.println("Total: " + total);
  }

}