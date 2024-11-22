package GradeException;

public class StudentTest
{
  public static void main(String[] args)
  {
    Student s1 = new Student("Nancy", 7);

    try
    {
      s1.setGrade(6);
    }
    catch (IllegalGradeException e)
    {
      System.err.println(e.getMessage());
    }

    System.out.println(s1);
  }

}
