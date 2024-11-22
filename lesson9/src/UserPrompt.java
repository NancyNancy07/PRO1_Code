import java.util.Scanner;

public class UserPrompt
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    String word;

    while (true)
    {
      System.out.println("Enter a word or type (quit) to end");
      word = input.nextLine();

      //defining quit first so that when user type quit
      // it will not reverse the word first and then end the loop

      //check if user types "quit"
      if (word.equals("quit") || word.equals("Quit"))
      {
        break;
      }

      //printing the reverse of world (hello to olleh)
      String reverseStr = "";

      for (int i = word.length() - 1; i >= 0; i--)
      {
        reverseStr += word.charAt(i);
      }
      System.out.println(reverseStr);
    }
    System.out.println("Quit the loop ;)");
  }
}
