public class DriverExam
{
  private String[] answers = {"B", "D", "A", "A", "C", "A", "B", "A", "C", "D",
      "B", "C", "D", "A", "D", "C", "C", "B", "D", "A"};

  private String[] studentAnswers;

  public DriverExam(String[] studentAnswers)
  {
    this.studentAnswers = studentAnswers;
  }

  public boolean passed()
  {
    return totalCorrect() >= 15;
  }

  public int totalCorrect()
  {
    int count = 0;
    for (int i = 0; i < answers.length; i++)
    {
      if (studentAnswers[i].equals(answers[i]))
      {
        count++;
      }
    }
    return count;
  }

  public int totalIncorrect()
  {
    return answers.length - totalCorrect();
  }

  public int[] questionMissed()
  {
    int missedCount = totalIncorrect();
    int[] missedQuestions = new int[missedCount];
    int index = 0;
    for (int i = 0; i < answers.length; i++)
    {
      if (!studentAnswers[i].equals(answers[i]))
      {
        missedQuestions[index] = i + 1;
        index++;
      }
    }
    return missedQuestions;
  }

  public String toString()
  {
    String rtnString = "";
    for (int i = 0; i < answers.length; i++)
    {
      rtnString += i + 1 + ":  " + answers[i] + "\n";
    }
    return rtnString;
  }
}
