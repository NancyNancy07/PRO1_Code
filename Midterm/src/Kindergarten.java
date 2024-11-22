import java.util.ArrayList;

public class Kindergarten
{
  private int countTeachers;
  private ArrayList<Child> children;

  public Kindergarten()
  {
    this.countTeachers = 0;
    children = new ArrayList<>();
  }

  public void addChild(Child child)
  {
    children.add(child);
  }

  public void removeChild(Child child)
  {
    children.remove(child);
  }

  public void hireTeachers(int count)
  {
    for (int i = 0; i < count; i++)
    {
      countTeachers++;
    }
  }

  public void fireTeacher()
  {
    for (int i = 0; i < countTeachers; i++)
    {
      countTeachers--;
    }
  }

  public int countChildren()
  {
    int count = 0;
    for (int i = 0; i < children.size(); i++)
    {
      count++;
    }
    return count;
  }

  public int countTeachers()
  {
    return countTeachers;
  }

  public double getAverageChildAge()
  {
    int total = 0;
    for (int i = 0; i < children.size(); i++)
    {
      total += children.get(i).getAge();
    }
    return (double) total / children.size();
  }

  public double getNorm()
  {
    return (double) children.size() / countTeachers;
  }

  public void celebrateBirthday(String name)
  {
    for (int i = 0; i < children.size(); i++)
    {
      if (children.get(i).getName().equals(name))
      {
        int age = children.get(i).getAge();
        age++;
        children.get(i).setAge(age);
      }
    }
  }

  public String toString()
  {
    String rtnString = "";
    rtnString += "Teachers: " + countTeachers + "\n";

    for (int i = 0; i < children.size(); i++)
    {
      rtnString += children.get(i);
    }
    return rtnString;
  }
}
