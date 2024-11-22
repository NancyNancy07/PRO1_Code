import java.util.Scanner;

public class Array5
{
  public static void main(String[] args)
  {
    int[] array1 = new int[4];
    int[] array2 = new int[4];
    boolean equal = true;

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

    //checking if they are identical
    if (array1.length != array2.length)
    {
      equal = false;
    }
    else
    {
      for (int i = 0; i < array1.length; i++)
      {
        if (array1[i] != array2[i])
        {
          equal = false;
          break;
        }
      }
    }

    if (equal)
    {
      System.out.println("Arrays are equal");
    }
    else
    {
      System.out.println("Arrays are not equal");
    }

  }
}
