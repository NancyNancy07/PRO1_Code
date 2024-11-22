import java.util.Scanner;

public class PiValue
{
  public static void main(String[] args)
  {

    // part a
    Scanner input = new Scanner(System.in);

    System.out.println("How many times the loop should run");
    int iteration = input.nextInt();

    double pi = 0;

    for (int i = 0; i < iteration; i++)
    {
      if (i % 2 == 0)
      {
        pi += 1 / (double) (1 + (2 * i));
      }
      else
      {
        pi -= 1 / (double) (1 + (2 * i));
      }

    }
    System.out.println(4 * pi);
  }
}
