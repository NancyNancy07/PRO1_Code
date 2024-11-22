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
    day = 13;
    month = 7;
    year = 2000;

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

  public String dayOfWeek()
  {
    //create local variables so that it does not change the original value of attributes
    int q = day;
    int m = month;
    int y = year;
    int k = y % 100;
    int j = y / 100;
    String h;

    if (m == 1)
    {
      m = 13;
      y--;
    }
    else if (m == 2)
    {
      m = 14;
      y--;
    }

    int dayName =
        (q + ((13 * (m + 1)) / 5) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

    switch (dayName)
    {
      case 0:
        return "Saturday";
      case 1:
        return "Sunday";
      case 2:
        return "Monday";
      case 3:
        return "Tuesday";
      case 4:
        return "Wednesday";
      case 5:
        return "Thursday";
      case 6:
        return "Friday";
    }
    return "Error";
  }

  //show result from created object
  public String toString()
  {
    return day + "/" + month + "/" + year;
  }

}
