import java.util.Scanner;

public class Workbench1
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int num1;
    int num2 = 0;

    while (num2 < 100)
    {
      System.out.println("Enter a number");
      num1 = input.nextInt();

      num2 = num1 * 10;
    }
    ;
  }
}
