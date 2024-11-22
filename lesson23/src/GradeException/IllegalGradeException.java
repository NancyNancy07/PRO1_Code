package GradeException;

public class IllegalGradeException extends RuntimeException
{
  public IllegalGradeException()
  {
    super("Invalid Grade");
  }

  public IllegalGradeException(String msg)
  {
    super("Invalid grade: " + msg);
  }
}
