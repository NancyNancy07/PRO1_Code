package Person;

public class Employee extends Person
{
  private int employeeID;
  private int yearsExperience;

  public Employee(String name, String address, int employeeID,
      int yearsExperience)
  {
    super(name, address);
    this.employeeID = employeeID;
    this.yearsExperience = yearsExperience;
  }

  public int getEmployeeID()
  {
    return employeeID;
  }

  public void setEmployeeID(int id)
  {
    this.employeeID = id;
  }

  public int getYearsExperience()
  {
    return yearsExperience;
  }

  public void setYearsExperience(int yearsExperience)
  {
    this.yearsExperience = yearsExperience;
  }

  public String toString()
  {
    return super.toString() + ", Employee ID: " + employeeID
        + ", Years Experience: " + yearsExperience;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || obj.getClass() != getClass())
    {
      return false;
    }
    Employee other = (Employee) obj;
    return super.equals(other) && employeeID == other.employeeID
        && yearsExperience == other.yearsExperience;
  }
}
