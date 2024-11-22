package Notebook;

public abstract class Note
{
  private String message;

  public Note(String message)
  {
    if (message == null)
    {
      throw new NullPointerException("Message is null");
    }
    if (message.length() == 0)
    {
      throw new IllegalArgumentException("Message is empty");
    }
    this.message = message;
  }

  public String getMessage()
  {
    return message;
  }

  public abstract Note copy();

  public String toString()
  {
    return "Message: " + message;
  }

}
