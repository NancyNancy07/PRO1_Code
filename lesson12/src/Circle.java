public class Circle
{
  private double radius;

  private double getArea()
  {
    return Math.PI * radius * radius;
  }

  private double getRadius()
  {
    return radius;
  }

  //constructor
  public Circle()
  {
    radius = 0;
  }

  public Circle(double radius)
  {
    this.radius = radius;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Circle other = (Circle) obj;
    return radius == other.radius && getArea() == other.getArea();

  }

  public boolean greaterThan(Circle obj)
  {

    return obj.getArea() < this.getArea();

  }

  public String toString()
  {
    return "Radius: " + radius + "\n Area of circle: " + getArea();
  }
}
