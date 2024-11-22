public class CarTest
{
  public static void main(String[] args)
  {
    Car car1 = new Car("12/07/2000", "Audi", "White", 2000);
    Car car2 = new Car("15/09/2010", "Volvo", "Black", 2020);
    Car car3 = new Car("15/09/2010", "Volvo", "Black", 2020);

    Garage garage1 = new Garage();
    Garage garage2 = new Garage();

    garage1.park(car1, 1);
    garage1.park(car2, 2);

    garage2.park(car2, 2);
    garage2.park(car3, 1);
    
  }
}
