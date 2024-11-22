package Person;

public class HeadOfDepartment extends Employee
{
  private String department;

  public HeadOfDepartment(String name, String address, int employeeID,
      int yearsExperience, String department)
  {
    super(name, address, employeeID, yearsExperience);
    this.department = department;
  }

  public String getDepartment()
  {
    return department;
  }

  public void setDepartment(String department)
  {
    this.department = department;
  }

  public String toString()
  {
    return super.toString() + ", Department: " + department;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || obj.getClass() != getClass())
    {
      return false;
    }

    HeadOfDepartment other = (HeadOfDepartment) obj;
    return super.equals(other) && department.equals(other.department);
  }
}
