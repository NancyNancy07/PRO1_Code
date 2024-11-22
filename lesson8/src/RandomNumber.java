import java.util.Random;
import java.util.Scanner;

public class RandomNumber
{
  public static void main(String[] args)
  {
    System.out.println("Guess the number between 1 - 10");

    //get user input
    Scanner input = new Scanner(System.in);
    int number2 = input.nextInt();

    //import random library
    Random randomNumber = new Random();
    int number1 = randomNumber.nextInt(1, 11);

    //if else statement
    String str = number1 == number2 ? "Yes ;) " : "No! it is " + number1;

    System.out.println(str);
  }
}
