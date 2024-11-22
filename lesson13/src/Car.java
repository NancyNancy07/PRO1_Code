public class Car
{
  private String make;
  private String model;
  private String color;
  private String licenseNumber;
  private int year;

  //overloaded (more constructors) Constructor
  public Car(String make, String model, String color, String licenseNumber,
      int year)
  {

    this.make = make;
    this.model = model;
    this.color = color;
    this.licenseNumber = licenseNumber;
    this.year = year;

  }

  public Car(String make, String model, String color, int year)
  {
    this.make = make;
    this.model = model;
    this.color = color;
    this.year = year;
    this.licenseNumber = null;
  }

  //get methods
  public String getMake()
  {
    return make;
  }

  public String getModel()
  {
    return model;
  }

  public String getColor()
  {
    return color;
  }

  public String getLicenseNumber()
  {
    return licenseNumber;
  }

  public int getYear()
  {
    return year;
  }

  //set methods
  public void setColor(String color)
  {
    this.color = color;
  }

  public void setLicenseNumber(String licenseNumber)
  {
    this.licenseNumber = licenseNumber;
  }

  //copy method of car object

  public Car copy()
  {
    return new Car(make, model, color, licenseNumber, year);
  }

  //equals method
  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Car other = (Car) obj;
    return this.make.equals(other.make) && this.model.equals(other.model)
        && this.color.equals(other.color) && this.licenseNumber.equals(
        other.licenseNumber) && this.year == other.year;
  }

  public String toString()
  {
    return "Car" + "\n make: " + make + "\n model: " + model + "\n color: "
        + color + "\n licenseNumber: " + licenseNumber + "\n year: " + year;
  }
}
