import java.util.Scanner;

public class Gender
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("What is your gender?");

    //make a local string variable called string
    //because there is no nextChar() in scanner
    //first have the string then have the first character of that string

    String string = input.nextLine();
    char gender = string.charAt(0);

    System.out.println("What is your age?");
    int age = input.nextInt();

    if (gender != 'm' && gender != 'f' || age < 0)
    {
      System.out.println("Error in typed values");
    }
    else if (gender == 'm' && age < 18)
    {
      System.out.println("Boy");
    }
    else if (gender == 'm' && age > 18)
    {
      System.out.println("Man");
    }
    else if (gender == 'f' && age < 18)
    {
      System.out.println("Girl");
    }
    else if (gender == 'f' && age > 18)
    {
      System.out.println("Woman");
    }
  }

}
