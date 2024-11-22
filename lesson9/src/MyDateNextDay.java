public class MyDateNextDay
{
  public static void main(String[] args)
  {
    MyDate date = new MyDate(13, 7, 2000);
    int days =0;
    while (!(date.getDay()==23 && date.getMonth()==9 && date.getYear()==2024))
    {

      date.nextDay();
      days++;
    }
    System.out.println(days);
  }
}
