package Person;

public class PersonTest
{
  public static void main(String[] args)
  {
    Teacher teacher = new Teacher("Allan", "Horsens", 123, 15);
    teacher.addCourse("Pro1");
    teacher.addCourse("Pro2");
    teacher.addCourse("Pro3");
    teacher.addCourse("Pro4");

    Student student = new Student("Bob", "Denmark", 1);
    student.addGrade("A");
    student.addGrade("C");
    student.addGrade("B");
    student.addGrade("A");

    System.out.println(teacher);
    System.out.println(student);
  }
}
