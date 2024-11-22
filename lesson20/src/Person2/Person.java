package Person2;

public class Person
{
  private String name;
  private String address;
  private String telephone;

  public Person(String name, String address, String telephone)
  {
    this.name = name;
    this.address = address;
    this.telephone = telephone;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getAddress()
  {
    return address;
  }

  public void setAddress(String address)
  {
    this.address = address;
  }

  public String getTelephone()
  {
    return telephone;
  }

  public void setTelephone(String telephone)
  {
    this.telephone = telephone;
  }

  public String toString()
  {
    return "Name: " + name + ", Address: " + address;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || obj.getClass() != getClass())
    {
      return false;
    }
    Person other = (Person) obj;
    return name.equals(other.name) && address.equals(other.address);
  }
}
