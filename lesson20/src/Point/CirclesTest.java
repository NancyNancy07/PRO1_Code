package Point;

public class CirclesTest
{
  public static void main(String[] args)
  {
    Circle circle = new Circle(29.6, 34.2, 5.1);
    Point center = circle.getCenter();

    circle.moveCircle(150, 0);

    Circle circle2 = new Circle(center.getX(), center.getY(), 5.1);

    CircleList circleList = new CircleList(3);
    circleList.addCircle(circle);
    circleList.addCircle(circle2);

    System.out.println(
        "Total area: " + circleList.getTotalArea() + " sq. mt, Average: "
            + circleList.getAverageArea() + " sq. mt");

    for (int i = 0; i < circleList.getNumberOfCircles() ; i++)
    {
      System.out.println(circleList.getCircle(i));
    }

  }
}
