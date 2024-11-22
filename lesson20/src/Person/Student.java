package Person;

import java.util.ArrayList;

public class Student extends Person
{
  private int studentNo;
  private ArrayList<String> grades;

  public Student(String name, String address, int studentNo)
  {
    super(name, address);
    this.studentNo = studentNo;
    grades = new ArrayList<>();
  }

  public int getStudentNo()
  {
    return studentNo;
  }

  public void setStudent(int studentNo)
  {
    this.studentNo = studentNo;
  }

  public void addGrade(String grade)
  {
    grades.add(grade);
  }

  public String getGrade(int index)
  {
    return grades.get(index);
  }

  public String[] getAllGrades()
  {
    return grades.toArray(new String[0]);
  }

  public String toString()
  {
    return super.toString() + ", Student No: " + studentNo + ", Grades: "
        + grades;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || obj.getClass() != getClass())
    {
      return false;
    }
    Student other = (Student) obj;
    return super.equals(other) && grades.equals(other.grades);
  }
}
