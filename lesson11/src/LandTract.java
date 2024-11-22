public class LandTract
{
  private double length;
  private double width;

  public LandTract(double length, double width)
  {
    this.length = length;
    this.width = width;
  }

  public double Area()
  {
    return this.length * this.width;
  }

  public boolean equals(LandTract obj)
  {
    if (this.length == obj.length && this.width == obj.width)
    {
      return true;
    }
    return false;
  }

  public String toString()
  {
    return "Area of Land tract is : " + Area();
  }
}
