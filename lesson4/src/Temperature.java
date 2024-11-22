public class Temperature
{
  private double ftemp;

  public Temperature(double ftemp)
  {
    this.ftemp = ftemp;
  }

  public void setFahrenheit(double f)
  {
    ftemp = f;
  }

  public double getFtemp()
  {
    return ftemp;
  }

  public double getCtemp()
  {
    return (5.0 / 9.0) * (ftemp - 32);
  }

  public double getKtemp()
  {
    return ((5.0 / 9.0) * (ftemp - 32)) + 273.15;
  }

  public String toString()
  {
    return "Ftemp: " + getFtemp() + "\n" + "Ctemp: " + getCtemp() + "\n"
        + "Ktemp: " + getKtemp();
  }
}
