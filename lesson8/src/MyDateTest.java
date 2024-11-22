import java.util.Scanner;

public class MyDateTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("write day as a number");
    int day = input.nextInt();

    System.out.println("write month as a number");
    int month = input.nextInt();

    System.out.println("write Year like (2000)");
    int year = input.nextInt();

    //create a new object
    // MyDate date = new MyDate(12,12,2023);
    MyDate date = new MyDate(day, month, year);

    //getting output for object date
    System.out.println(date);
    System.out.println("Is leap year: " + date.isLeapYear());
    System.out.println("Days in month: " + date.daysInMonth());
    System.out.println("Astro Sign: " + date.getAstroSign());
    System.out.println("Month Name: " + date.getMonthName());
  }
}
