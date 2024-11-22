package Person;

public class FullDegreeStudent extends Student
{
  private int semester;

  public FullDegreeStudent(String name, String address, int studentNo,
      int semester)
  {
    super(name, address, studentNo);
    this.semester = semester;
  }

  public int getSemester()
  {
    return semester;
  }

  public void setSemester(int semester)
  {
    this.semester = semester;
  }

  public String toString()
  {
    return super.toString() + ", Semester: " + semester;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || obj.getClass() != getClass())
    {
      return false;
    }

    FullDegreeStudent other = (FullDegreeStudent) obj;
    return super.equals(other) && semester == other.semester;
  }
}
