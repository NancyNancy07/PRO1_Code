public class Instructor
{
  private String name;
  private int officeNumber;

  public Instructor(String name, int officeNumber)
  {
    this.name = name;
    this.officeNumber = officeNumber;
  }

  public String getName()
  {
    return name;
  }

  public int getOfficeNumber()
  {
    return officeNumber;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || obj.getClass() != getClass())
    {
      return false;
    }

    Instructor other = (Instructor) obj;
    return name.equals(other.name) && officeNumber == other.officeNumber;
  }

  public String toString()
  {
    return "Instructor name: " + name + "\nOffice Number: " + officeNumber;
  }
}
