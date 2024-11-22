public class Colour
{
  private int red;
  private int green;
  private int blue;

  public Colour(int red, int green, int blue)
  {
    this.red = red;
    this.green = green;
    this.blue = blue;
  }

  public void set(int red, int green, int blue)
  {
    this.red = red;
    this.green = green;
    this.blue = blue;
  }

  public int getRed()
  {
    return red;
  }

  public int getGreen()
  {
    return green;
  }

  public int getBlue()
  {
    return blue;
  }

  public boolean isGray()
  {
    if (red == green && green == blue)
    {
      return true;
    }
    return false;
  }

  public void mixWith(Colour colour2)
  {
    this.red = (int) ((0.5 * this.red) + (0.5 * colour2.red));
    this.green = (int) ((0.5 * this.green) + (0.5 * colour2.green));
    this.blue = (int) ((0.5 * this.blue) + (0.5 * colour2.blue));
  }

  public Colour copy()
  {
    return new Colour(red, green, blue);
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Colour other = (Colour) obj;
    return red == other.red && green == other.green && blue == other.blue;
  }

  public String toString()
  {
    return "r: " + red + ", g: " + green + ", b: " + blue + "\n";
  }
}
