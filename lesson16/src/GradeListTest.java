public class GradeListTest
{
  public static void main(String[] args)
  {
    Grade grade1 = new Grade("SEP", -3);
    Grade grade2 = new Grade("WEB", 10);
    Grade grade3 = new Grade("PRO", 10);
    Grade grade4 = new Grade("MSE", 12);

    GradeList myGrades = new GradeList(6);

    myGrades.setGrade(grade1, 0);
    myGrades.setGrade(grade2, 1);
    myGrades.setGrade(grade3, 2);
    myGrades.setGrade(grade4, 3);

    System.out.println(myGrades);
  }
}
