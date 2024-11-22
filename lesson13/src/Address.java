public class Address
{
  private String street;
  private String number;
  private String postalCode;
  private String city;
  private String country;

  public Address(String st, String no, String pc, String ci, String co)
  {
    street = st;
    number = no;
    postalCode = pc;
    city = ci;
    country = co;
  }

  public void setAddress(String st, String no, String pc, String ci, String co)
  {
    street = st;
    number = no;
    postalCode = pc;
    city = ci;
    country = co;
  }

  public String getStreet()
  {
    return street;
  }

  public void setStreet(String street)
  {
    this.street = street;
  }

  public String getNumber()
  {
    return number;
  }

  public void setNumber(String number)
  {
    this.number = number;
  }

  public String getPostalCode()
  {
    return postalCode;
  }

  public void setPostalCode(String postalCode)
  {
    this.postalCode = postalCode;
  }

  public String getCity()
  {
    return city;
  }

  public void setCity(String city)
  {
    this.city = city;
  }

  public String getCountry()
  {
    return country;
  }

  public void setCountry(String country)
  {
    this.country = country;
  }

  public String toString()
  {
    return "Address: " + "\n" + "Street: " + street + "\nNumber: " + number
        + "\nPostalCode: " + postalCode + "\nCity: " + city + "\nCountry: "
        + country;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Address other = (Address) obj;
    return street.equals(other.street) && number.equals(other.number)
        && postalCode.equals(other.postalCode) && city.equals(other.city)
        && country.equals(other.country);
  }
}


