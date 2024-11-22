public class CourseTest
{
  public static void main(String[] args)
  {
    Instructor instructor1 = new Instructor("Allan", 12);
    Instructor instructor2 = new Instructor("Jacob", 11);

    Course course1 = new Course("Pro1", instructor1);
    Course course2 = new Course("Math", instructor1);

    course2.setSecondaryInstructor(instructor2);

    course1.addStudent(new Student("Nancy", 1));
    course1.addStudent(new Student("John", 2));
    course1.addStudent(new Student("Bob", 1));
    course1.addStudent(new Student("Ella", 2));
    course1.addStudent(new Student("Emma", 1));
    course1.addStudent(new Student("Jelly", 2));

    course2.addStudent(new Student("Nancy", 2));
    course2.addStudent(new Student("John", 1));
    course2.addStudent(new Student("Bob", 2));
    course2.addStudent(new Student("Ella", 1));
    course2.addStudent(new Student("Emma", 2));
    course2.addStudent(new Student("Jelly", 1));

    System.out.println(course1);
  }
}
