public class ApartmentTest
{
  public static void main(String[] args)
  {
    Apartment apartment1 = new Apartment("Horsens", 5600.00);
    apartment1.rentTo("Nancy", "12345668");

    apartment1.chargeRent();
    apartment1.collectRent(1000);
    System.out.println(apartment1);
  }
}
