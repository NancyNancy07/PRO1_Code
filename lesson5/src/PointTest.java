public class PointTest
{
  public static void main(String[] args)
  {
    //two objects
    Point point1 = new Point(5, 9);
    Point point2 = new Point(10, 3);

    System.out.println(point1);
    System.out.println(point2);

    double distance = Math.sqrt(
        ((point2.getX() - point1.getX()) * (point2.getX() - point1.getX())

        ) + (point2.getY() - point1.getY()) * (point2.getY() - point1.getY()));

    System.out.println(distance);
  }

}
