public class Guest
{
  private String name;

  public Guest(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || obj.getClass() != getClass())
    {
      return false;
    }
    Guest other = (Guest) obj;
    return name.equals(other.name);
  }
}
