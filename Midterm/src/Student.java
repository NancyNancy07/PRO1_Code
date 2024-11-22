public class Student
{
  private String name;
  private int semester;

  public Student(String name, int semester)
  {
    this.name = name;
    this.semester = semester;
  }

  public String getName()
  {
    return name;
  }

  public int getSemester()
  {
    return semester;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Student other = (Student) obj;
    return name.equals(other.name) && semester == other.semester;
  }

  public String toString()
  {
    return "Student name: " + name + "\nSemester: " + semester;
  }
}
