package Vehicle;

public class VehicleTest
{
  public static void main(String[] args)
  {
    Van van = new Van("Nancy", 120000, "DK12", 1500);
    SportsCar sportsCar = new SportsCar("Bob", 10000.00, "DK18", 120);
    Bicycle bicycle = new Bicycle("John", 5000.00, 5);
    Car car = new Car("Ella", 1500000, "DK1122");

    System.out.println(van + "\n" + sportsCar + "\n" + bicycle + "\n" + car);

  }
}
