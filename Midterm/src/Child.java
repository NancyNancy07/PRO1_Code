public class Child
{
  private String name;
  private int age;

  public Child(String name, int age)
  {
    this.name = name;
    this.age = age;
  }

  public String getName()
  {
    return name;
  }

  public int getAge()
  {
    return age;
  }

  public void setAge(int age)
  {
    this.age = age;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }

    Child other = (Child) obj;
    return name.equals(other.name) && age == other.age;
  }

  public String toString()
  {
    return "Name: " + name + ", Age: " + age + "\n";
  }

}
