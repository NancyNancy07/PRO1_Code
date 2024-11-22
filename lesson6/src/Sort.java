import java.util.Scanner;

public class Sort
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("First digit");
    int digit1 = input.nextInt();

    System.out.println("Second digit");
    int digit2 = input.nextInt();

    //smallest number
    if (digit1 > digit2)
    {
      System.out.println("Smallest Number: " + digit2);
    }
    else if (digit2 > digit1)
    {
      System.out.println("Smallest Number: " + digit1);
    }

    //sort two numbers
    if (digit1 > digit2)
    {
      System.out.println(
          "Sort smallest first: " + "\n" + digit2 + "\n" + digit1);
    }
    else if (digit2 > digit1)
    {
      System.out.println(
          "Sort smallest first: " + "\n" + digit1 + "\n" + digit2);
    }

    //sort three digit
    System.out.println("give another digit");
    int digit3 = input.nextInt();

    //check digit1 is smaller from digit2
    if (digit1 < digit2 && digit2 < digit3)

    {
      System.out.println(
          "Sort smallest first: " + "\n" + digit1 + " " + digit2 + " "
              + digit3);
    }

    //check digit1 is smaller from digit3
    else if (digit1 < digit3 && digit3 < digit2)

    {
      System.out.println(
          "Sort smallest first: " + "\n" + digit1 + " " + digit3 + " "
              + digit2);
    }

    //check digit2 is smaller from digit1
    else if (digit2 < digit1 && digit1 < digit3)
    {
      System.out.println(
          "Sort smallest first: " + "\n" + digit2 + " " + digit1 + " "
              + digit3);
    }

    //check digit2 is smaller from digit3
    else if (digit2 < digit3 && digit3 < digit1)
    {
      System.out.println(
          "Sort smallest first: " + "\n" + digit2 + " " + digit3 + " "
              + digit1);
    }

    //check digit3 smaller than digit2
    else if (digit3 < digit2 && digit2 < digit1)
    {
      System.out.println(
          "Sort smallest first: " + "\n" + digit3 + " " + digit2 + " "
              + digit3);
    }

    //check digit3 smaller than digit1
    else if (digit3 < digit1 && digit1 < digit2)
    {
      System.out.println(
          "Sort smallest first: " + "\n" + digit3 + " " + digit1 + " "
              + digit2);
    }
    else
    {
      System.out.println("Error");
    }

    //sort four numbers
    System.out.println("Give forth digit");
    int digit4 = input.nextInt();
    //digit1 smaller
  }

}
