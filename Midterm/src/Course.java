import java.util.ArrayList;

public class Course
{
  private String title;
  private Instructor[] instructors;
  private ArrayList<Student> students;

  public Course(String title, Instructor primaryInstructor)
  {
    this.title = title;
    instructors = new Instructor[2];

    instructors[0] = primaryInstructor;

    this.students = new ArrayList<>();
  }

  public String getTitle()
  {
    return title;
  }

  public Instructor getPrimaryInstructor()
  {
    Instructor primaryInstructor = null;
    for (int i = 0; i < instructors.length; i++)
    {
      primaryInstructor = instructors[0];
    }
    return primaryInstructor;
  }

  public Instructor getSecondaryInstructor()
  {
    Instructor secondaryInstructor = null;
    for (int i = 0; i < instructors.length; i++)
    {
      if (instructors[i] != getPrimaryInstructor())
      {
        secondaryInstructor = instructors[i];
      }
    }
    return secondaryInstructor;
  }

  public void setSecondaryInstructor(Instructor instructor)
  {
    for (int i = 0; i < instructors.length; i++)
    {
      if (instructors[i] != getPrimaryInstructor())
      {
        instructors[i] = instructor;
      }
    }
  }

  public void addStudent(Student student)
  {
    students.add(student);
  }

  public int getNumberOfInstructors()
  {
    return instructors.length;
  }

  public int getNumberOfStudents(int semester)
  {
    int numberOfStudents = 0;
    for (int i = 0; i < students.size(); i++)
    {
      if (students.get(i).getSemester() == semester)
      {
        numberOfStudents++;
      }
    }
    return numberOfStudents;
  }

  public Student[] getStudentBySemester(int semester)
  {
    Student[] tempArr = new Student[students.size()];
    Student[] arr = students.toArray(tempArr);

    for (int i = 0; i < students.size(); i++)
    {
      if (students.get(i).getSemester() == semester)
      {
        arr[i] = students.get(i);
      }
    }
    return arr;
  }

  public boolean hasStudent(String name)
  {
    for (int i = 0; i < students.size(); i++)
    {
      if (students.get(i).getName().equals(name))
      {
        return true;
      }
    }
    return false;
  }

  public String toString()
  {
    String rtnString = "";
    rtnString += "Course: " + title;

    rtnString += "\nPrimary " + getPrimaryInstructor();

    for (int i = 0; i < instructors.length; i++)
    {
      if (instructors[i] == getSecondaryInstructor())
      {
        rtnString += "\nSecondary: " + getSecondaryInstructor();
      }
    }

    for (int i = 0; i < students.size(); i++)
    {
      rtnString += "\n" + students.get(i);
    }
    return rtnString;
  }
}
