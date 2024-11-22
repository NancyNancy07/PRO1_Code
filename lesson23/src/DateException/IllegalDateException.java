package DateException;

public class IllegalDateException extends RuntimeException
{
  //without argument constructor
  public IllegalDateException()
  {
    super("Invalid Date");
  }

  public IllegalDateException(String msg)
  {
    super("Invalid Date: " + msg);
  }
}
