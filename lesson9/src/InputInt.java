import java.util.Scanner;

public class InputInt
{
  public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);
    System.out.println("Type an int");
    int n = input.nextInt();


    //print all numbers
    for (int i = 1; i <= n; i++)
    {
      System.out.println(i + ", ");
    }

    //print 2*n
    for (int j = 1; j <= n; j++)
    {
      System.out.println(2 * j + ", ");
    }

    //print square of n
    for (int k = 1; k <= n; k++)
    {
      System.out.println(k * k + ", ");
    }
  }
}
