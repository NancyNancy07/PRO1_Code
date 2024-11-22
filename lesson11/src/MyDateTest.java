// import java.util.Scanner;

public class MyDateTest
{
  public static void main(String[] args)
  {

    // Scanner input = new Scanner(System.in);
/*
    System.out.println("Initial year");
    int initialYear = input.nextInt();

    System.out.println("End year");
    int endYear = input.nextInt();
*/
    //create a new object
    MyDate date = new MyDate(12, 2, 2024);
    MyDate date2 = new MyDate(1, 3, 2024);
    MyDate date3 = date.copy();
    MyDate date4 = new MyDate(date2);

    if (date.equals(date2))
    {
      System.out.println("same date");
    }
    else
    {
      System.out.println("dates does not matches");
    }

    date3.setDay(15);
    System.out.println(date3);

    date4.setYear(2000);
    System.out.println(date4);

    System.out.println(date.isBefore(date2));
    //using for loop for finding the leap year/////////////////////////////////

    //define the variable to count the number of leap years

   /* int counter = 0;

    for (int i = 1582; i <= 2024; i++)
    {
      //setting the year to object
      date.setYear(i);

      // check if it is a leap year
      if (date.isLeapYear())
      {
        counter++;
        System.out.println("\nCurrent year: " + date.getYear());
        System.out.println(counter);
      }
    }

    //for user input find leap years
    for (int j = initialYear; j <= endYear; j++)
    {
      //   System.out.println(j);

      //set the all years to date object
      date.setYear(j);

      //now find the leap year
      if (date.isLeapYear())
      {
        System.out.println("Leap year: " + date.getYear());
      }

    }*/
  }
}
