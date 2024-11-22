public class Date
{
  private int day;
  private int month;
  private int year;

  public Date(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public Date()
  {
    this.day = 1;
    this.month = 12;
    this.year = 2000;
  }

  public void set(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public Date copy()
  {
    return new Date(this.day, this.month, this.year);
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Date other = (Date) obj;
    return (this.day == other.day && this.month == other.month
        && this.year == other.month);
  }

  public String toString()
  {
    String rtnString = "";
    return rtnString += this.day + "/" + this.month + "/" + this.year;
  }

}
