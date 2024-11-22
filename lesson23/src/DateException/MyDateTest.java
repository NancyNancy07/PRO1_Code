package DateException;

public class MyDateTest
{
  public static void main(String[] args)
  {
    MyDate date = new MyDate(12, 12, 2000);

    try
    {
      date.setDay(2);
      date.setMonth(13);
    }
    catch (IllegalDateException e)
    {
      System.err.println(e.getMessage());
    }

    System.out.println(date);
  }
}
