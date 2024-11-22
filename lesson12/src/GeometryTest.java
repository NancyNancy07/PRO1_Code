import java.util.Scanner;

public class GeometryTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int choice;

    do
    {

      System.out.println(
          "Geometry Calculator\n" + "1. Calculate the Area of a Circle\n"
              + "2. Calculate the Area of a Rectangle\n"
              + "3. Calculate the Area of a Triangle\n" + "4. Quit");
      System.out.println("Choose from (1 - 4) ");
      choice = input.nextInt();
/*
      if (choice == 1)
      {
        System.out.println("Enter value for radius");
        double cirRadius = input.nextInt();
        double cirArea = Geometry.getAreaOfCircle(cirRadius);
        System.out.println(cirArea);
      }
      else if (choice == 2)
      {
        System.out.println("Enter value for length");
        double length = input.nextInt();

        System.out.println("Enter the value for width");
        double width = input.nextInt();

        double reactArea = Geometry.getAreaOfRect(length, width);
        System.out.println(reactArea);
      }
      else if (choice == 3)
      {
        System.out.println("Enter value for base");
        double base = input.nextInt();

        System.out.println("Enter the value for height");
        double height = input.nextInt();

        double triangleArea = Geometry.getAreaOfTriangle(base, height);
        System.out.println(triangleArea);
      }
      else if (choice == 4)
      {
        break;
      }
*/
      switch (choice)
      {
        case 1:
          System.out.println("Enter value for circle radius");
          double cirRadius = input.nextInt();
          double cirArea = Geometry.getAreaOfCircle(cirRadius);
          if (cirArea != -1)
          {
            System.out.println("Circle Area: " + cirArea);
          }
          break;

        case 2:
          System.out.println("Enter value for rect length");
          double length = input.nextInt();

          System.out.println("Enter the value for rect width");
          double width = input.nextInt();

          double reactArea = Geometry.getAreaOfRect(length, width);
          if (reactArea != 1)
          {
            System.out.println("Rectangle Area: " + reactArea);
          }
          break;

        case 3:
          System.out.println("Enter value for base");
          double base = input.nextInt();

          System.out.println("Enter the value for height");
          double height = input.nextInt();

          double triangleArea = Geometry.getAreaOfTriangle(base, height);
          if (triangleArea != 1)
          {
            System.out.println("Triangle Area: " + triangleArea);
          }
          break;

        case 4:

          System.out.println("You quit");
          break;

        default:
          System.out.println("Error: Please enter a valid option (1-4).");
          break;

      }
    }

    while (choice != 4);
  }
}
