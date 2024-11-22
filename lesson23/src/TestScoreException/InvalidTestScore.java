package TestScoreException;

public class InvalidTestScore extends RuntimeException
{
  public InvalidTestScore()
  {
    super("Invalid Score");
  }

  public InvalidTestScore(String msg)
  {
    super("Invalid Score: " + msg);
  }
}
