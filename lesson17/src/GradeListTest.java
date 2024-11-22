import java.util.ArrayList;

public class GradeListTest
{
  public static void main(String[] args)
  {
    GradeList gradeList = new GradeList();

    gradeList.addGrade(new Grade("Pro", 10));
    gradeList.addGrade(new Grade("Mse", 7));
    gradeList.addGrade(new Grade("Web", 4));
    gradeList.addGrade(new Grade("Sep", 2));

    System.out.println(gradeList);
  }
}
