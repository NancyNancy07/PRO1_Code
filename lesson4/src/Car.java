public class Car
{

  //define attributes (fields)
  private int yearModel;
  private String make;
  private int speed;

  //constructor
  public Car(int yearModel, String make)
  {
    this.yearModel = yearModel;
    this.make = make;
    this.speed = 0;
  }

  //methods

  public int getYearModel()
  {
    return yearModel;
  }

  public String getMake()
  {
    return make;
  }

  public int getSpeed()
  {
    return speed;
  }

  public int accelerate()
  {
    return speed += 5;
  }

  public int brake()
  {
    return speed -= 5;
  }
}
