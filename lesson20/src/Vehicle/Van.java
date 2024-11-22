package Vehicle;

public class Van extends Car
{
  private int maxLoad;

  public Van(String owner, double price, String regNo, int maxLoad)
  {
    super(owner, price, regNo);
    this.maxLoad = maxLoad;
  }

  public int getMaxLoad()
  {
    return maxLoad;
  }

  public String toString()
  {
    return super.toString() + ", Max Load: " + maxLoad;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || obj.getClass() != getClass())
    {
      return false;
    }
    Van other = (Van) obj;
    return super.equals(other) && maxLoad == other.maxLoad;
  }
}
