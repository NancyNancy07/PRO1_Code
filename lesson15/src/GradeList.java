public class GradeList
{
  private int[] grades;

  public GradeList(int numberOfGrades)
  {
    grades = new int[numberOfGrades];
    for (int i = 0; i < grades.length; i++)
    {
      grades[i] = -1; // making the grade to -1 because it is not a danish grade
    }
  }

  public int numberOfGrades()
  {
    int counter = 0;
    for (int i = 0; i < grades.length; i++)
    {
      if (grades[i] != -1) //checking if it is not -1 then it is a danish grade
      {
        counter++;
      }
    }
    return counter;
  }

  public int getGrade(int index)
  {

    return grades[index];
  }

  public void setGrade(int grades, int index)
  {
    boolean isDanishGrade = false;
    int[] danishGrade = {-3, 0, 2, 4, 7, 10, 12};

    for (int i = 0; i < danishGrade.length; i++)
    {
      if (grades == danishGrade[i])
      {
        isDanishGrade = true;
        break;
      }
    }

    if (isDanishGrade)
    {
      this.grades[index] = grades;
    }
  }

  public double getAverage()
  {
    int total = 0;
    for (int i = 0; i < grades.length; i++)
    {
      total += grades[i];
    }
    return (double) total / grades.length;
  }

  public String toString()
  {
    String rtnString = "";
    for (int i = 0; i < grades.length; i++)
    {
      rtnString += "Index: " + i + ", Grade: " + grades[i] + "\n";
    }
    return rtnString;
  }
}
