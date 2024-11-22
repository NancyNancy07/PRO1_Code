public class Note
{
  private String message;
  private boolean highPriority;

  public Note(String message)
  {
    this.message = message;
    this.highPriority = false;
  }
  //copy constructor

  public String getMessage()
  {
    return message;
  }

  public void setMessage(String message)
  {
    this.message = message;
  }

  public boolean isHighPriority()
  {
    return highPriority;
  }

  public void setToHighPriority()
  {
    highPriority = true;
  }

  public void setToLowPriority()
  {
    highPriority = false;
  }

  public Note copy()
  {
    Note n = new Note(message);
    if (isHighPriority())
      n.setToHighPriority();

    return n;
  }

  public String toString()
  {
    String rtnString = "";
    rtnString += "message: " + message + "\n";
    if (isHighPriority())
    {
      message += ", (High Priority)";
    }
    return rtnString;
  }
}
