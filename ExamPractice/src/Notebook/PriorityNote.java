package Notebook;

public class PriorityNote extends Note
{
  private int priority;

  public PriorityNote(String message, int priority)
  {
    super(message);
    if (priority != 1 && priority != 2 && priority != 3)
    {
      throw new IllegalArgumentException("Not a valid priority number");
    }
    this.priority = priority;
  }

  public int getPriority()
  {
    return priority;
  }

  public Note copy()
  {
    return new PriorityNote(super.getMessage(), priority);
  }

  public String toString()
  {
    return super.toString() + ", Priority: " + priority;
  }
}
