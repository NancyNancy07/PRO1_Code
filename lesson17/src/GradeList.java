import java.util.ArrayList;

public class GradeList
{
  //defining the ArrayList with its type "Grade" and then name of the array
  private ArrayList<Grade> grades;

  public GradeList()
  {
    //initialise the ArrayList
    grades = new ArrayList<Grade>();
  }

  public int getNumberOfGrades()
  {
    //using size method to get the number of elements in an array
    return grades.size();
  }

  public ArrayList<Grade> getAllGrades()
  {
    return grades;
  }

  public Grade[] getAllGradesAsArray()
  {
    Grade[] tempArray = new Grade[grades.size()];
    Grade[] arr = grades.toArray(tempArray);
    return arr;
  }

  public void addGrade(Grade grade)
  {
    grades.add(grade);
  }

  public double getAverage()
  {
    int total = 0;
    for (int i = 0; i < grades.size(); i++)
    {
      total += grades.get(i).getGrade();
    }

    return (double) total / grades.size();
  }

  public String toString()
  {
    String rtnString = "";

    rtnString +=
        "Average: " + this.getAverage() + ", total Grades: " + grades.size()
            + "\n";
    for (int i = 0; i < this.getAllGradesAsArray().length; i++)
    {
      rtnString += grades.get(i);
    }

    return rtnString;
  }
}
