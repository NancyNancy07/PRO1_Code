package Person;

import java.util.ArrayList;

public class Teacher extends Employee
{
  private ArrayList<String> courses;

  public Teacher(String name, String address, int employeeID,
      int yearsExperience)
  {
    super(name, address, employeeID, yearsExperience);
    courses = new ArrayList<>();
  }

  public String getCourse(int index)
  {
    return courses.get(index);
  }

  public void addCourse(String course)
  {
    courses.add(course);
  }

  public String[] getCourses()
  {
    return courses.toArray(new String[0]);
  }

  public String toString()
  {
    return super.toString() + ", Courses: " + courses;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || obj.getClass() != getClass())
    {
      return false;
    }

    Teacher other = (Teacher) obj;
    return super.equals(other) && courses.equals(other.courses);
  }
}
