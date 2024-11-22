public class MyDateTest
{
  public static void main(String[] args)
  {

    //create a new object
    // MyDate date = new MyDate(12,12,2023);
    MyDate date = new MyDate();

    //getting output for object date
    System.out.println(date);
    System.out.println(date.isLeapYear());
    System.out.println(date.daysInMonth());
    System.out.println(date.getAstroSign());
    System.out.println(date.dayOfWeek());
  }
}
