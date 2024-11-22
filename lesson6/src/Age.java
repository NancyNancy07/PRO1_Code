import java.util.Scanner;

public class Age
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    //input from user
    System.out.println("What is your age?");
    int age = input.nextInt();
    if (age < 0)
    {
      System.out.println("Error in age value");
    }
    else if (age <= 12)
    {
      System.out.println("Child");
    }
    else if (age <= 19)
    {
      System.out.println("Teenager");
    }
    else if (age <= 65)
    {
      System.out.println("Adult");
    }
    else
    {
      System.out.println("Senior citizen");
    }
  }
}
