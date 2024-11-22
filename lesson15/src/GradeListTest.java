public class GradeListTest
{
  public static void main(String[] args)
  {
    GradeList myGrades = new GradeList(5);

    myGrades.setGrade(7, 1);
    myGrades.setGrade(10, 2);
    myGrades.setGrade(12, 4);
    myGrades.setGrade(2, 3);
    myGrades.setGrade(4, 0);

    System.out.println(myGrades);
  }

}
