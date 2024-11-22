import java.util.Random;
import java.util.Scanner;

public class GuessNumber
{
  public static void main(String[] args)
  {
    int num1; // user input
    int num2; // my computer input;o
    int attempts = 0; // no of times user guessing the number ( it is like counter)
    Scanner input = new Scanner(System.in);
    Random randomNumber = new Random();
    num2 = randomNumber.nextInt(1, 1001);

    do
    {
      System.out.println("Guess the number between 1 - 1000");

      //add 1 each time user plays again
      attempts++;

      num1 = input.nextInt();

      //adding statements with three conditions
      if (num1 < num2)
      {
        System.out.println("Too low!!!... Try again :(");
      }
      else if (num1 > num2)
      {
        System.out.println("Too high!!!... Try again :(");

      }
      else
      {
        System.out.println("Wooo hooo!!!! Correct");
        System.out.println(
            "You guessed the right number in " + attempts + " attempts.");
      }
    }
    while (num1 != num2);
  }
}
