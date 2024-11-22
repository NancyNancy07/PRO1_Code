import java.util.Scanner;

public class ClockTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    //clock 1
  /*  System.out.println("hours as an int");
    int hours = input.nextInt();

    System.out.println("minutes as an int");
    int minutes = input.nextInt();

    System.out.println("seconds as an int");
    int seconds = input.nextInt();

    //clock 2
    System.out.println("write time in seconds");
    int timeInSeconds = input.nextInt();
*/
    Clock c1 = new Clock(11, 12, 13);
    Clock c2 = new Clock(12, 11, 12);
    Clock c3 = c1.copy();
    c3.tic();

    //have doubt about tic() method it changes the original time second value
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println("Is clock 1 is before clock 2: " + c1.isBefore(c2));
    System.out.println("Clock 1 in seconds: " + c1.convertToSeconds());
    System.out.println("Clock 2 hours: " + c2.getHour());
    System.out.println("Clock 1 time format24: " + c1.isTimeFormat24());
    System.out.println("Clock 2 time format24: " + c2.isTimeFormat24());

  }

}
