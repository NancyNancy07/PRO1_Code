package Person;

public class ExchangeStudent extends Student
{
  private int intProjectGroup;

  public ExchangeStudent(String name, String address, int studentNo,
      int intProjectGroup)
  {
    super(name, address, studentNo);
    this.intProjectGroup = intProjectGroup;
  }

  public int getProjectGroup()
  {
    return intProjectGroup;
  }

  public void setProjectGroup(int group)
  {
    this.intProjectGroup = group;
  }

  public String toString()
  {
    return super.toString() + ", Project Group: " + intProjectGroup;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || obj.getClass() != getClass())
    {
      return false;
    }

    ExchangeStudent other = (ExchangeStudent) obj;
    return super.equals(other) && intProjectGroup == other.intProjectGroup;
  }
}
