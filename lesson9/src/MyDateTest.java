import java.util.Scanner;

public class MyDateTest
{
  public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);

    System.out.println("Initial year");
    int initialYear = input.nextInt();

    System.out.println("End year");
    int endYear = input.nextInt();

    //create a new object
    MyDate date = new MyDate(12, 2, 2024);
   // System.out.println("next day: " + date.nextDay());

    //using for loop for finding the leap year/////////////////////////////////

    //define the variable to count the number of leap years
    int counter = 0;

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

    }
  }
}
