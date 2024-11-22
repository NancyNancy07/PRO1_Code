public class RainfallTest
{
  public static void main(String[] args)
  {
    //defining rainfall data
    double[] rainfallData = {1.1, 1.2, 1.3, 1.4, 2.5, 3.6, 1.5, 1.6, 1.7, 5.7,
        1.8, 1.9};

    //initialize  Rainfall class
    Rainfall rainfall = new Rainfall(rainfallData);

    System.out.println("Total rainfall: " + rainfall.totalRainfall());
    System.out.println(
        "Average monthly rainfall: " + rainfall.averageMonthlyRainfall());
    System.out.println("Month with most rain: " + rainfall.mostRainyMonth());
    System.out.println("Month with least rain: " + rainfall.leastRainyMonth());
  }
}
