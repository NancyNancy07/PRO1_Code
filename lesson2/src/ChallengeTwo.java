import java.util.Scanner;
public class ChallengeTwo
{
  public static void main(String[] args){
    Scanner addition = new Scanner(System.in);

    System.out.println("Give first number");
    int firstDigit = addition.nextInt();

    System.out.println("Give second number");
    int secondDigit = addition.nextInt();

    System.out.println("Give last number");
    int thirdDigit = addition.nextInt();

    int sum = firstDigit + secondDigit + thirdDigit;

    System.out.println("Total Sum: " + sum);

  }
}
