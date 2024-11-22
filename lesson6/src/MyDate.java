public class MyDate
{
  //define attributes
  private int day;
  private int month;
  private int year;

  //constructors

  // no argument constructor
  public MyDate()
  {
    day = 10;
    month = 9;
    year = 2025;

  }

  // with parameters arguments
  //  public MyDate(int day, int month, int year)
  //  {
  //    this.day = day;
  //    this.month = month;
  //    this.year = year;
  //  }

  //set methods
  public void setDay(int d)
  {
    day = d;
  }

  public void setMonth(int m)
  {
    month = m;
  }

  public void setYear(int y)
  {
    year = y;
  }

  //get methods
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

  public String displayDate()
  {
    return day + "/" + month + "/" + year;
  }

  public boolean isLeapYear()
  {
    return year % 4 == 0;
  }

  //show result from created object
  public String toString()
  {
    return day + "/" + month + "/" + year;
  }

}
