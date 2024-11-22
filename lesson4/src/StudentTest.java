public class StudentTest
{
  public static void main(String[] args)
  {
    Student student1 = new Student("Nancy", 'F', 1);
    Student student2 = new Student("John", 'M', 2);
    Student student3 = new Student("Maria", 'F');

    student3.setStudentNumber(3);
    student1.setName("Nancy Singh");
    student2.setGender('F');

    System.out.println(student1.toString());
    System.out.println(student2.toString());
    System.out.println(student3.toString());
  }
}
