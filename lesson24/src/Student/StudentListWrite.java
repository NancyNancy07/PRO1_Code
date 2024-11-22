package Student;

import java.util.ArrayList;

public class StudentListWrite
{
  public static void main(String[] args)
  {
    ArrayList<Student> list = new ArrayList<Student>();
    list.add(new Student("Bob", "Bobson", "Denmark"));
    list.add(new Student("Jane", "Doe", "England"));
    list.add(new Student("John", "Doe", "USA"));

  }
}
