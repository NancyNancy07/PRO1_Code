import java.util.Scanner;

public class Array4
{
  public static void main(String[] args)
  {
    int[] numbers = new int[5];
    int total = 0;
    double average = 0;
    Scanner input = new Scanner(System.in);

    System.out.println("Enter an integer");
    for (int i = 0; i < numbers.length; i++)
    {
      System.out.println("Integer " + (i + 1) + ": ");
      numbers[i] = input.nextInt();
    }

    System.out.println("Average: ");
    for (int j = 0; j < numbers.length; j++)
    {
      total += numbers[j];
    }
    average = (double) total / numbers.length;
    System.out.println(average);
  }
}
