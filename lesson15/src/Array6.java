import java.util.Scanner;

public class Array6
{
  public static void main(String[] args)
  {
    int[] array1 = new int[4];
    int[] array2 = new int[4];
    int[] sumArray = new int[array1.length];

    Scanner input = new Scanner(System.in);

    System.out.println("Enter an Integer: ");
    for (int i = 0; i < array1.length; i++)
    {
      System.out.println("Integer " + (i + 1) + ": ");
      array1[i] = input.nextInt();
    }

    System.out.println("Enter an Integer: ");
    for (int i = 0; i < array2.length; i++)
    {
      System.out.println("Integer " + (i + 1) + ": ");
      array2[i] = input.nextInt();
    }

    //storing sum of each array element in sumArray
    for (int i = 0; i < array1.length; i++)
    {
      sumArray[i] += array1[i] + array2[i];
      System.out.println(sumArray[i]);
    }

  }
}
