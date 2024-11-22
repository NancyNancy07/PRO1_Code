public class Tenant
{
  private String name;
  private MyDate rentedFrom;

  public Tenant(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public MyDate getRentedFrom()
  {
    return rentedFrom.copy();
  }

  public void setRentedFrom(MyDate date)
  {
    this.rentedFrom = date;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || obj.getClass() != getClass())
    {
      return false;
    }

    Tenant other = (Tenant) obj;
    return name.equals(other.name) && rentedFrom == other.rentedFrom;
  }

  public String toString()
  {
    return "Tenant: " + name + ", Rented From: " + rentedFrom;
  }
}
