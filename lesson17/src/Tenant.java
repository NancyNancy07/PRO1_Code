public class Tenant
{
  private String name;
  private String phone;
  private double rentDue;

  public Tenant(String name, String phone)
  {
    this.name = name;
    this.phone = phone;
    this.rentDue = 0.0;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setPhone(String phone)
  {
    this.phone = phone;
  }

  public void setRentDue(double rentDue)
  {
    this.rentDue = rentDue;
  }

  public String getName()
  {
    return name;
  }

  public String getPhone()
  {
    return phone;
  }

  public double getRentDue()
  {
    return rentDue;
  }

  public Tenant copy()
  {
    return new Tenant(name, phone);
  }

  public String toString()
  {
    return "Name: " + name + "\nPhone: " + phone;
  }
}
