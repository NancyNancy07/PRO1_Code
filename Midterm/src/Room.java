public class Room
{
  private int number;
  private Bed bed;
  private Guest guest;

  public Room(int number, String bedType)
  {
    this.number = number;
    this.bed = new Bed(bedType);
    this.guest = null;
  }

  public int getNumber()
  {
    return number;
  }

  public int getFloor()
  {
    return number;
  }

  public double getPrice()
  {
    if (bed.isSingle())
    {
      return 59.50;
    }
    else if (bed.isDouble())
    {
      return 72.40;
    }
    else if (bed.isKingSize())
    {
      return 89.00;
    }
    return -1;
  }

  public boolean isOccupied()
  {
    if (guest != null)
    {
      return true;
    }
    return false;
  }

  public void registerGuest(Guest guest)
  {
    this.guest = guest;
  }

  public void vacant()
  {
    if (isOccupied())
    {
      this.guest = null;
    }
  }

  public String getBedType()
  {
    if (bed.isSingle())
    {
      return "Single";
    }
    else if (bed.isDouble())
    {
      return "Double";
    }
    else if (bed.isKingSize())
    {
      return "King size";
    }
    return "No Type";
  }

  public Guest getGuest()
  {
    return guest;
  }

}
