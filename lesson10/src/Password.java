import java.util.Scanner;

public class Password
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter username");
    String userName = input.nextLine();

    String password;
    String confirmPassword;

    do
    {
      System.out.println("Enter password");
      password = input.nextLine();

      System.out.println("Confirm password");
      confirmPassword = input.nextLine();

      if (password.equals(confirmPassword))
      {
        System.out.println("it's correct!!!");
        System.out.println("Username: " + userName);
        System.out.println("Password: " + password);
      }
      else
      {
        System.out.println("Password does not match...Try again!!");
      }
    }
    while (!password.equals(confirmPassword));
  }
}
