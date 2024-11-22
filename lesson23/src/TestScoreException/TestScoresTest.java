package TestScoreException;

import DateException.IllegalDateException;

public class TestScoresTest
{
  public static void main(String[] args)
  {
    int[] scores = {50, -1, 30, 50, 20};
    TestScores scoresArr = new TestScores(scores);

    try
    {
      scores[0] = -1;
      scores[2] = 101;
    }
    catch (InvalidTestScore e)
    {
      System.err.println(e.getMessage());
    }

    System.out.println(scoresArr);

  }

}
