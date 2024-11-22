public class ParkedCar
{
  private String make;
  private String model;
  private String color;
  private String licenseNumber;
  private int minutesCarParked;

  public ParkedCar(String make, String model, String color,
      String licenseNumber)
  {
    this.make = make;
    this.model = model;
    this.color = color;
    this.licenseNumber = licenseNumber;
  }

  public void setMake(String make)
  {
    this.make = make;
  }

  public void setModel(String model)
  {
    this.model = model;
  }

  public void setColor(String color)
  {
    this.color = color;
  }

  public void setLicenseNumber(String licenseNumber)
  {
    this.licenseNumber = licenseNumber;
  }

  public void setMinutesCarParked(int minutesCarParked)
  {
    this.minutesCarParked = minutesCarParked;
  }

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

  public int getMinutesCarParked()
  {
    return minutesCarParked;
  }

  public String toString()
  {
    return "Car Details: " + "\nMake: " + make + "\nModel: " + model
        + "\nColor: " + color + "\nLicenseNumber: " + licenseNumber;
  }
}

