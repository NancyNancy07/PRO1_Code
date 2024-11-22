package Person;

public class ITSupporter extends Employee
{
  private String workArea;

  public ITSupporter(String name, String address, int employeeID,
      int yearsExperience, String workArea)
  {
    super(name, address, employeeID, yearsExperience);
    this.workArea = workArea;
  }

  public String getWorkArea()
  {
    return workArea;
  }

  public void setWorkArea(String workArea)
  {
    this.workArea = workArea;
  }

  public String toString()
  {
    return super.toString() + ", Work Area: " + workArea;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || obj.getClass() != getClass())
    {
      return false;
    }

    ITSupporter other = (ITSupporter) obj;
    return super.equals(other) && workArea.equals(other.workArea);
  }
}
