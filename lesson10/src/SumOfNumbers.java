import java.util.Scanner;

public class SumOfNumbers
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Write a positive nonzero integer");
    int positiveInt = input.nextInt();
    int sum = 0;
    for (int i = 1; i <= positiveInt; i++)
    {
      sum += i;
    }
    System.out.println(sum);
  }
}
