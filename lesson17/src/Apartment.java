public class Apartment
{
  private String address;
  private double rent;
  private Tenant tenant;

  public Apartment(String address, double rent)
  {
    this.address = address;
    this.rent = rent;
    tenant = null;

  }

  public String getAddress()
  {
    return address;
  }

  public void setRent(double rent)
  {
    this.rent = rent;
  }

  public double getRent()
  {
    return rent;
  }

  public void rentTo(String name, String phone)
  {
    if (!isOccupied())
    {
      this.tenant = new Tenant(name, phone);
    }
  }

  public void evict()
  {

    tenant = null;

  }

  public boolean isOccupied()
  {
    if (tenant != null)
    {
      return true;
    }
    return false;
  }

  public Tenant getTenant()
  {
    return tenant.copy();
  }

  public double getRentDue()
  {
    if (tenant != null)
    {
      return tenant.getRentDue();
    }
    else
    {
      return 1;
    }
  }

  public void chargeRent()
  {
    if (tenant != null)
    {
      tenant.setRentDue(tenant.getRentDue() + rent);
    }
  }

  public void collectRent(double amount)
  {
    if (isOccupied())
    {
      tenant.setRentDue(tenant.getRentDue() - amount);
    }
  }

  public String toString()
  {
    String rtnString = "";
    if (tenant == null)
    {
      rtnString += "No Tenant";
    }
    else
    {
      rtnString += "Tenant Details: " + getTenant() + "\nAddress: " + address
          + "\nRent Duo: " + getRentDue();
    }
    return rtnString;
  }
}
