public class Rainfall
{
  private double[] rainfall;
  private double total = 0;
  private double average;

  public Rainfall(double[] rainfall)
  {
    this.rainfall = new double[rainfall.length];

    for (int i = 0; i < rainfall.length; i++)
    {
      this.rainfall[i] = rainfall[i];
    }

  }

  public double totalRainfall()
  {
    for (int i = 0; i < rainfall.length; i++)
    {
      total += rainfall[i];
    }
    return total;
  }

  public double averageMonthlyRainfall()
  {
    return totalRainfall() / rainfall.length;
  }

  public int mostRainyMonth()
  {
    int mostRainy = (int) rainfall[0];
    for (int i = 1; i < rainfall.length; i++)
    {
      if (rainfall[i] > mostRainy)
      {
        mostRainy = i + 1;
      }
    }
    return mostRainy;
  }

  public int leastRainyMonth()
  {

    int leastRainy = (int) rainfall[0];

    for (int i = 1; i < rainfall.length; i++)
    {
      if (rainfall[i] < leastRainy)
      {
        leastRainy = i + 1;
      }
    }
    return leastRainy;
  }
}
