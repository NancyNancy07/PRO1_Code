public class PoliceOfficer
{
  private String name;
  private int badgeNumber;

  public PoliceOfficer(String name, int badgeNumber)
  {
    this.name = name;
    this.badgeNumber = badgeNumber;
  }

  public ParkingTicket checkCar(ParkedCar parkedCar, ParkingMeter parkingMeter)
  {
    if (parkedCar.getMinutesCarParked() > parkingMeter.getMinutesPurchased())
    {
      return new ParkingTicket(parkedCar, PoliceOfficer.this, parkingMeter);
    }
    else
    {
      return null;
    }
  }

  public String toString()
  {
    return "Issued by: " + "\nName: " + name + "\nBadge Number: "
        + badgeNumber;
  }
}

