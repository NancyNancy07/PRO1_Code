package Point;

public class Circle
{
  private double radius;
  private Point center;

  public Circle(double x, double y, double radius)
  {
    this.radius = radius;
    center = new Point(x, y);
  }

  public Point getCenter()
  {
    return center.copy();
  }

  public double getRadius()
  {
    return radius;
  }

  public void moveCircle(double dx, double dy)
  {
    center.move(dx,dy);
  }

  public double getArea()
  {
    return (radius * radius) * Math.PI;
  }

  public String toString()
  {
    return "Center: " + center + ", Radius: " + radius + ", Area: " + getArea();
  }

  public boolean equals(Object obj)
  {
    if (obj == null || obj.getClass() != getClass())
    {
      return false;
    }

    Circle other = (Circle) obj;
    return radius == other.radius && center.equals(other.center);
  }
}
