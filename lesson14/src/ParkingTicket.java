public class ParkingTicket
{
  private int fine;
  private ParkedCar parkedCar;
  private PoliceOfficer policeOfficer;
  private ParkingMeter parkingMeter;

  public ParkingTicket(ParkedCar parkedCar, PoliceOfficer policeOfficer,
      ParkingMeter parkingMeter)
  {
    this.parkedCar = parkedCar;
    this.policeOfficer = policeOfficer;
    this.parkingMeter = parkingMeter;
  }

  public void calculateFine(int minutesPurchased, int minutesCarParked)
  {
    int extraMinutes = minutesCarParked - minutesPurchased;
    if (extraMinutes > 0)
    {
      fine = 25;
      extraMinutes -= 60;
      if (extraMinutes > 0)
      {
        fine += 10;
      }
    }
    else
    {
      fine = 0;
    }

  }

  public int getFine()
  {
    return fine;
  }

  public String toString()
  {
    return "Parking Ticket Details: " + "\nCar: " + parkedCar.getMake() + " "
        + parkedCar.getModel() + " " + parkedCar.getColor()
        + "\nLicense number: " + parkedCar.getLicenseNumber() + "\nFine: "
        + fine + "\nOfficer: " + policeOfficer;
  }
}
