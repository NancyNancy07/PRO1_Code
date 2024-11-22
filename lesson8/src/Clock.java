public class Clock
{
  private int hours;
  private int minutes;
  private int seconds;
  private boolean timeFormat24;

  //constructor
  public Clock(int h, int m, int s)
  {
    this.hours = h;
    this.minutes = m;
    this.seconds = s;
  }

  public Clock(int totalTimeInSeconds)
  {

    //seconds in hours is 3600
    this.hours = totalTimeInSeconds / 3600;

    totalTimeInSeconds = totalTimeInSeconds - hours * 3600;
    this.minutes = totalTimeInSeconds / 60;

    totalTimeInSeconds = totalTimeInSeconds - minutes * 60;
    this.seconds = totalTimeInSeconds;
  }

  public void set(int h, int m, int s)
  {

    this.hours = h;
    this.minutes = m;
    this.seconds = s;
  }

  public void setTimeFormat(int hourFormat)
  {
    timeFormat24 = hourFormat != 12;
  }

  public boolean isTimeFormat24()
  {
    return timeFormat24;
  }

  public int getHour()
  {
    return hours;
  }

  public int getMinute()
  {
    return minutes;
  }

  public int getSecond()
  {
    return seconds;
  }

  public void tic()
  {
    this.seconds++;
    if (this.seconds == 60)
    {
      this.seconds = 0;
      this.minutes++;

    }

    if (this.minutes == 60)
    {
      this.minutes = 0;
      this.hours++;
    }

    if (this.hours == 24)
    {
      this.hours = 0;
    }
  }

  public int convertToSeconds()
  {
    return hours * 3600 + minutes * 60 + seconds;
  }

  public boolean isBefore(Clock time)
  {
    if (time == null)
    {
      return false;
    }
    return this.convertToSeconds() < time.convertToSeconds();
  }

  public int timeInSecondsTo(Clock time)
  {
    if (this.isBefore(time))
    {
      return time.convertToSeconds() - this.convertToSeconds();
    }
    return this.convertToSeconds() - time.convertToSeconds();

  }

  public Clock timeTo(Clock time)
  {
    int diff = timeInSecondsTo(time);

    return new Clock(diff);
  }

  public Clock copy()
  {
    return new Clock(hours, minutes, seconds);
  }

  public String toString()
  {
    String timeUnit = "";
    int displayHour = hours;

    if (!isTimeFormat24())
    {
      if (hours >= 12)
      {
        // using modulus, this shows the remainder when hours divides by 12
        //e.g. 14/ 12 = 2 remainder, it is actually  2 pm :)
        displayHour = hours % 12;
        timeUnit = "PM";
      }
      else if (displayHour == 0)
      {
        displayHour = 12;
      }
      else
      {
        timeUnit = "AM";
      }
    }
    return "Time is: " + hours + ":" + minutes + ":" + seconds;

  }

}
