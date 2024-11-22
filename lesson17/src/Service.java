public class Service
{
  private int mileage;
  private Date date;

  public Service(int mileage, Date date)
  {
    this.mileage = mileage;
    this.date = date.copy();
  }

  public int getMileage()
  {
    return mileage;
  }

  public Date getDate()
  {
    return date;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Service other = (Service) obj;
    return this.mileage == other.getMileage() && this.date == other.date;
  }

  public String toString()
  {
    String rtnString = "";
    return rtnString += "Mileage: " + mileage + "\nDate: " + date +"\n";
  }
}
