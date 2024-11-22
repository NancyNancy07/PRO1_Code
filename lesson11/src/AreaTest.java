import java.util.Scanner;

public class AreaTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Radius for a circle?");
    double circleRadius = input.nextDouble();

    System.out.println("Length for rectangle?");
    double rectLength = input.nextDouble();

    System.out.println("Width for rectangle?");
    double rectWidth = input.nextDouble();

    System.out.println("Radius for cylinder?");
    double cylinderR = input.nextDouble();

    System.out.println("Height for cylinder?");
    double cylinderH = input.nextDouble();

    double areaOfCircle = Area.circleArea(circleRadius);
    double areaOfRect = Area.rectangleArea(rectWidth, rectLength);
    double areaOfCylinder = Area.cylinderArea(cylinderR, cylinderH);
    System.out.println("Area of circle: " + areaOfCircle);
    System.out.println("Area of rectangle: " + areaOfRect);
    System.out.println("Area of cylinder: " + areaOfCylinder);

  }
}
