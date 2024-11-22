import java.util.Scanner;

public class Workbench8
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("How long it should be?");
    int length = input.nextInt();

    input.nextLine();
    System.out.println("Which symbol?");
    String space = input.nextLine();
    char symbol = space.charAt(0);

    String spaceStr = "";
    for (int i = 0; i <= length; i++)
    {
      for (int k = 0; k < i; k++)
      {
        spaceStr += " ";
      }
      System.out.println(symbol + spaceStr + symbol);
      spaceStr = "";
    }

  }
}
