public class RoomDimension
{
  private double length;
  private double width;

  public RoomDimension(double len, double w)
  {
    length = len;
    width = w;

  }

  public double getArea()
  {
    return length * width;
  }

  public String toString()
  {
    return "length: " + length + "\nWidth: " + width + "\nArea of room: "
        + getArea() + "square meter";
  }
}
