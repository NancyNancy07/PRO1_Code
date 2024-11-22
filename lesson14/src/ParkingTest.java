public class ParkingTest
{
  public static void main(String[] args)
  {
    ParkedCar parkedCar = new ParkedCar("Ford", "Mustang", "Black", "DK001");
    parkedCar.setMinutesCarParked(120);

    ParkingMeter minutesPurchased = new ParkingMeter(100);

    PoliceOfficer officer = new PoliceOfficer("Bob", 123);

    //checking if car purchased time is expired
    ParkingTicket ticket = officer.checkCar(parkedCar, minutesPurchased);

    if (ticket != null)
    {
      System.out.println("Ticket issued: " + "\n" + ticket);
    }
    else
    {
      System.out.println("No ticket issued");
    }
  }
}
