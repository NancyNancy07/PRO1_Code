public class Point
{
  //attributes
  private int x;
  private int y;

  //constructor
  public Point(int x, int y)
  {
    this.x = x;
    this.y = y;
  }

  //set methods
  public void setX(int x)
  {
    this.x = x;

  }

  public void setY(int y)
  {
    this.y = y;
  }

  //get method
  public int getX()
  {
    return x;
  }

  public int getY()
  {
    return y;
  }

  public void moveTo(int newX, int newY)
  {
    this.x = newX;
    this.y = newY;
  }

  public void move(int xDistance, int yDistance)
  {
    this.x += xDistance;
    this.y += yDistance;

  }

  public String toString(){
    return "(" + x +  "," + y + ")";
  }
}
