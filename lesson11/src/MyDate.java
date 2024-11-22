import java.time.LocalDate;

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

    //another call the static method
    MyDate obj = MyDate.today();
    this.day = obj.day;
    this.month = obj.month;
    this.year = obj.year;
    //another method
    /*LocalDate currentDate = LocalDate.now();
    int currentDay = currentDate.getDayOfMonth();
    int currentMonth = currentDate.getMonthValue();
    int currentYear = currentDate.getYear();
    this.day = currentDay;
    this.month = currentMonth;
    this.year = currentYear;*/
  }

  // with parameters arguments
  public MyDate(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  //constructor for copy the class
  public MyDate(MyDate date)
  {
    this.day = date.day;
    this.month = date.month;
    this.year = date.year;
  }

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

  public int daysInMonth()
  {
    if (month == 4 || month == 6 || month == 9 || month == 11)
    {
      return 30;
    }
    else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
        || month == 10 || month == 12)
    {
      return 31;
    }
    else if (month == 2 && isLeapYear())
    {
      return 29;
    }
    else if (month == 2)
    {
      return 28;
    }
    else
    {
      return -1; //uses -1 to show error;
    }
  }

  public String getAstroSign()
  {
    if ((day >= 21 && month == 3) || (day <= 9 && month == 4))
    {
      return "Aries";
    }

    else if ((day >= 20 && month == 4) || (day <= 20 && month == 5))
    {
      return "Taurus";
    }
    else if ((day >= 21 && month == 5) || (day <= 20 && month == 6))
    {
      return "Gemini";
    }
    else if ((day >= 22 && month == 6) || (day <= 22 && month == 7))
    {
      return "Cancer";
    }
    else if ((day >= 23 && month == 7) || (day <= 22 && month == 8))
    {
      return "Leo";
    }
    else if ((day >= 23 && month == 8) || (day <= 22 && month == 9))
    {
      return "Virgo";
    }
    else if ((day >= 23 && month == 9) || (day <= 22 && month == 10))
    {
      return "Libra";
    }
    else if ((day >= 23 && month == 10) || (day <= 21 && month == 11))
    {
      return "Scorpio";
    }
    else if ((day >= 22 && month == 11) || (day <= 21 && month == 12))
    {
      return "Sagittarius";
    }
    else if ((day >= 22 && month == 12) || (day <= 19 && month == 1))
    {
      return "Capricorn";
    }
    else if ((day >= 20 && month == 1) || (day <= 18 && month == 2))
    {
      return "Aquarius";
    }
    else if ((day >= 19 && month == 2) || (day <= 20 && month == 3))
    {
      return "Pisces";
    }

    return "No Astro Sign";
  }

  public String getMonthName()
  {
    switch (month)
    {
      case 1:
        return "January";
      case 2:
        return "February";
      case 3:
        return "March";
      case 4:
        return "April";
      case 5:
        return "May";
      case 6:
        return "June";
      case 7:
        return "July";
      case 8:
        return "August";
      case 9:
        return "September";
      case 10:
        return "October";
      case 11:
        return "November";
      case 12:
        return "December";
      default:
        return "Error!! Try again";
    }
  }

  public void nextDay()
  {
    day++;

    if (day > daysInMonth())
    {
      day = 1;
      month++;

      if (month > 12)
      {
        month = 1;
        year++;
      }
    }


    /*
    if (this.day == 31)
    {
      this.day = 1;
      this.month++;
    }
    else if (this.day ==31 && this.month == 12)
    {
      this.month = 1;
      this.year++;
    }
    else
    {
      return this.day++;
    }

    if (this.isLeapYear() && this.day == 29 && this.month == 2)
    {
      day = 1;
    }

    return -1;

     */
  }

  // adding next days
  public void nextDays(int days)
  {
    this.day += days;
    for (int i = 0; i < days; i++)

    //another method
    // this.nextDay();

    //my method and it works :)
    {
      if (day > daysInMonth())
      {
        day = day - daysInMonth();
        month++;
        if (month > 12)
        {
          month = 1;
          year++;
        }
      }
    }
  }

  //comparing the dates obj
  public boolean equals(MyDate obj)
  {
    if (this.day == obj.day && this.month == obj.month && this.year == obj.year)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  // making a copy of an obj
  public MyDate copy()
  {
    return new MyDate(day, month, year);
  }

  //static methods calls directly from class in the test class
  //like MyDate.today

  public static MyDate today()
  {
    LocalDate currentDate = LocalDate.now();
    int currentDay = currentDate.getDayOfMonth();
    int currentMonth = currentDate.getMonthValue();
    int currentYear = currentDate.getYear();
    return new MyDate(currentDay, currentMonth, currentYear);
  }

  public boolean isBefore(MyDate date2)
  {
    if (this.year < date2.year)
    {
      return true;
    }
    else if (this.year == date2.year && this.month < date2.month)
    {
      return true;
    }
    else if (this.year == date2.year && this.month == date2.month
        && this.day < date2.day)
    {
      return true;
    }
    return false;
  }

  //show result from created object
  public String toString()
  {
    return day + "/" + month + "/" + year;
  }

}