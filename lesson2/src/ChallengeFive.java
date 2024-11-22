import java.util.Scanner;

public class ChallengeFive
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("first test score");
    int firstDigit = input.nextInt();

    System.out.println("second test score");
    int secondDigit = input.nextInt();

    System.out.println("third test score");
    int thirdDigit = input.nextInt();

    int total = firstDigit + secondDigit + thirdDigit;
    double average = ((double)firstDigit + secondDigit + thirdDigit) / 3;

    System.out.println("score1: " + firstDigit);
    System.out.println("score2: " + secondDigit);
    System.out.println("score3: " + thirdDigit);
    System.out.println("score: " + total);
    System.out.println("Average: " + average);
  }
}
