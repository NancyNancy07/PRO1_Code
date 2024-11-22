package TestScoreException;

public class TestScores
{
  private int[] scores;

  public TestScores(int[] scores)
  {
    for (int i = 0; i < scores.length; i++)
    {
      if (scores[i] < 0 || scores[i] > 100)
      {
        throw new InvalidTestScore("Not a valid score");
      }
      this.scores = scores;
    }
  }

  public double getAverage()
  {
    int total = 0;
    for (int i = 0; i < scores.length; i++)
    {
      if (scores[i] < 0 || scores[i] > 100)
      {
        throw new InvalidTestScore("Not a valid score");
      }
      total += scores[i];
    }

    return (double) total / scores.length;
  }

  public String toString()
  {
    String rtnString = "[";
    for (int i = 0; i < scores.length; i++)
    {
      rtnString += scores[i] + ",";
    }
    rtnString += "]";
    return rtnString;
  }
}
