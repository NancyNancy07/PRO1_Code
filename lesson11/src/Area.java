public class Area
{

  public static double circleArea(double radius)
  {
    return Math.PI * (radius * radius);
  }

  public static double rectangleArea(double width, double length)
  {
    return width * length;
  }

  public static double cylinderArea(double radius, double height)
  {
    return Math.PI * (radius * radius) * height;
  }
}
