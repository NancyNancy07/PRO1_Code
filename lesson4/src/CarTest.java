public class CarTest
{
  public static void main(String[] args)
  {

    //new object
    Car carData = new Car(2024, "Swift");

    // calls accelerate method
    System.out.println(carData.accelerate());
    System.out.println(carData.accelerate());
    System.out.println(carData.accelerate());
    System.out.println(carData.accelerate());
    System.out.println(carData.accelerate());

    //calls brake method
    System.out.println(carData.brake());
    System.out.println(carData.brake());
    System.out.println(carData.brake());
    System.out.println(carData.brake());
    System.out.println(carData.brake());
  }
}
