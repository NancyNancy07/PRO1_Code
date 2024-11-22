import java.util.Scanner;

public class TemperatureTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    //ask user for input for Fahrenheit
    System.out.println("Write temperature for Fahrenheit value");
    double ftemp = input.nextDouble();

    //object from class
    Temperature tempValue= new Temperature(ftemp);

    //print output
    System.out.println("Temperature: " + tempValue);
  }

}
