public class Garage
{
  private Car pos1;
  private Car pos2;

  public Garage()
  {
    this.pos1 = null;
    this.pos2 = null;
  }

  public boolean isParkingAreaTaken(int position)
  {
    if (position == 1)
    {
      return pos1 != null; //shows that the car is parked there
    }
    else if (position == 2)
    {
      return pos2 != null;
    }
    return false;
  }

  public void park(Car car, int position)
  {
    switch (position)
    {
      case 1:
        if (!isParkingAreaTaken(1))
        {
          this.pos1 = car;
        }
        break;

      case 2:
        if (!isParkingAreaTaken(2))
        {
          this.pos2 = car;
        }
    }
  }

  public Car leaveGarage(int position)
  {
    //introduce local variable
    Car temp;
    if (position == 1)
    {
      temp = pos1;
      temp = null;
      return temp;
    }
    else if (position == 2)
    {
      temp = pos2;
      temp = null;
      return temp;
    }
    return null;
  }

  public String toString()
  {
    return "Car1: " + pos1 + "\nCar2: " + pos2;
  }

  public boolean equals(Object obj)
  {
    if (this == obj)
    {
      return true;
    }
    else if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }

    Garage other = (Garage) obj;

    boolean pos1;
    boolean pos2;

    if (this.pos1 == null && other.pos1 == null)
    {
      pos1 = true;
    }
    else if (this.pos1 != null && this.pos1.equals(other.pos1))
    {
      pos1 = true;
    }
    else
    {
      pos1 = false;
    }

    if (this.pos2 == null && other.pos2 == null)
    {
      pos2 = true;
    }
    else if (this.pos2 != null && this.pos2.equals(other.pos2))
    {
      pos2 = true;
    }
    else
    {
      pos2 = false;
    }
    return pos1 && pos2;
  }
}
