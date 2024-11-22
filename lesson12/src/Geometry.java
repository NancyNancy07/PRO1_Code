public class Geometry
{

  public static double getAreaOfCircle(double radius)
  {
    if (radius < 0)
    {
      System.out.println("Radius can not be negative");
      return -1;
    }
    return Math.PI * radius * radius;
  }

  public static double getAreaOfRect(double length, double width)
  {
    if (length < 0 || width < 0)
    {
      System.out.println("Length and Width can not be negative");

      return -1;
    }
    return length * width;
  }

  public static double getAreaOfTriangle(double base, double height)
  {
    if (base < 0 || height < 0)
    {
      System.out.println("Base and Height can not be negative");

      return -1;
    }
    return base * height * 0.5;
  }
}
