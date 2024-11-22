import java.util.Scanner;

public class LandTractTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Length for first land tract?");
    double length1 = input.nextDouble();

    System.out.println("Width for first land tract?");
    double width1 = input.nextDouble();

    LandTract landTract1 = new LandTract(length1, width1);

    System.out.println("Length for second land tract?");
    double length2 = input.nextDouble();

    System.out.println("Width for second land tract?");
    double width2 = input.nextDouble();

    LandTract landTract2 = new LandTract(length2, width2);

    System.out.println(landTract1);
    System.out.println(landTract2);
    System.out.println(landTract1.equals(landTract2));

  }
}
