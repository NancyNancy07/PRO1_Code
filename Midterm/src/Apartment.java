public class Apartment
{
  private int number;
  private Tenant tenant;

  public Apartment(int number)
  {
    this.number = number;
    this.tenant = null;
  }

  public int getNumber()
  {
    return number;
  }

  public boolean isAvailable()
  {
    if (tenant != null)
    {
      return false;
    }
    return true;
  }

  public void rentTo(Tenant tenant, MyDate rentedFrom)
  {
    MyDate currentDate = MyDate.now();
    if (isAvailable())
    {
      this.tenant = tenant;
      currentDate = rentedFrom;
    }
  }

  public Tenant getTenant()
  {
    return tenant;
  }

  public String getString(){
    return "Number: " + number + ", Tenant: " + tenant;
  }
}
