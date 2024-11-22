import java.util.Scanner;

public class Password
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a username");
    String userName = input.nextLine();

    System.out.println("Enter password");
    String password = input.nextLine();

    System.out.println("Confirm password");
    String confirmedPassword = input.nextLine();

    String message1 = "Password confirmed";
    String message2 = "Password do not match";

    if (password.equals(confirmedPassword))
    {
      System.out.println(message1);
    }
    else
    {
      System.out.println(message2);
    }

  }
}
