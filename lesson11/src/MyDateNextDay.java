public class MyDateNextDay
{
  public static void main(String[] args)
  {
    MyDate date = new MyDate(13, 7, 2000);
    MyDate date2 = date.copy();

    date2.nextDays(5000);
    System.out.println(date2);
    int days = 0;
    while (!(date.getDay() == 23 && date.getMonth() == 9
        && date.getYear() == 2024))
    {
      date.nextDay();
      days++;
    }
    System.out.println(days);
  }
}
