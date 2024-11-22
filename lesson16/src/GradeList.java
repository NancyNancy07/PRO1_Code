public class GradeList
{
  private Grade[] grades;

  public GradeList(int numberOfGrades)
  {
    grades = new Grade[numberOfGrades];
  }

  public int getNumberOfGrades()
  {
    int counter = 0;
    for (int i = 0; i < grades.length; i++)
    {
      if (grades[i] != null)
      {
        counter++;
      }
    }
    return counter;
  }

  public Grade getGrade(int index)
  {
    return grades[index];
  }

  public void setGrade(Grade grade, int index)
  {
    boolean isDanishGrade = false;
    int[] danishGrade = {-3, 0, 2, 4, 7, 10, 12};

    //checking if it is a danish grade or not
    for (int i = 0; i < danishGrade.length; i++)
    {
      if (grade.getGrade() == danishGrade[i])
      {
        isDanishGrade = true;
        break;
      }
    }

    if (isDanishGrade)
    {
      this.grades[index] = grade;
    }
  }

  public double getAverage()
  {
    int total = 0;
    for (int i = 0; i < grades.length; i++)
    {
      total += grades[i].getGrade();
    }
    return (double) total / grades.length;
  }

  public String toString()
  {
    String rtnString = "";
    for (int i = 0; i < grades.length; i++)
    {
      if (grades[i] == null)
      {
        rtnString += "Empty\n";
      }
      else
      {
        rtnString += grades[i] + "\n";
      }
    }
    return rtnString;
  }
}
