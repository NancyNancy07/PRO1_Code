import java.time.LocalDate;

public class MyDate
{
  private int day;
  private int month;
  private int year;

  public MyDate(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public int getDay()
  {
    return day;
  }

  public int getMonth()
  {
    return month;
  }

  public int getYear()
  {
    return year;
  }

  public void set(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public MyDate copy()
  {
    return new MyDate(day, month, year);
  }

  public boolean equals(Object obj)
  {
    if (obj == null || obj.getClass() != getClass())
    {
      return false;
    }

    MyDate other = (MyDate) obj;
    return day == other.day && month == other.month && year == other.year;
  }

  public String toString()
  {
    return "Date: " + day + "/" + month + "/" + year;
  }

  public static MyDate now()
  {
    LocalDate currentDate = LocalDate.now();
    return new MyDate(currentDate.getDayOfMonth(), currentDate.getMonthValue(),
        currentDate.getYear());
  }
}
