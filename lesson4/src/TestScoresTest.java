import java.util.Scanner;

public class TestScoresTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    //user input
    System.out.println("Test 1 Score");
    double test1 = input.nextDouble();

    System.out.println("Test 2 Score");
    double test2 = input.nextDouble();

    System.out.println("Test 3 Score");
    double test3 = input.nextDouble();

    //object
    TestScores scoreData = new TestScores(test1, test2, test3);

    System.out.println(scoreData);
  }
}
