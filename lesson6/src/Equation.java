import java.util.Scanner;

public class Equation
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Give value for 'a'");
    double a = input.nextDouble();

    System.out.println("Give value for 'b'");
    double b = input.nextDouble();

    System.out.println("Give value for 'c'");
    double c = input.nextDouble();

    double d = (b * b) - 4 * (a * c);

    System.out.println("D: " + d);

    double x;
    double x1;
    double x2;

    if (d < 0)
    {
      System.out.println("No solution");
    }
    else if (d == 0)
    {
      x = -b / (2 * a);
      System.out.println(x);
    }
    else if (d > 0)
    {
      x1 = (-b + Math.sqrt(d)) / (2 * a);
      x2 = (-b - Math.sqrt(d)) / (2 * a);
      System.out.println("x1: " + x1 + "\n" + "x2: " + x2);
    }
  }

}
