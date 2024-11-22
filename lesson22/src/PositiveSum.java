import java.util.Scanner;

public class PositiveSum
{
  public static void main(String[] args)
  {
    int positiveSum = 0;

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a digit");
    int x = input.nextInt();

    do
    {
      if (x > 0)
      {
        positiveSum = positiveSum + x;
      }
      else
      {
        x = input.nextInt();
      }
    }

    while (x != 0);
  }
}
