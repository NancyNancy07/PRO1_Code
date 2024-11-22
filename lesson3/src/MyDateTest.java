public class MyDateTest
{
  public static void main(String[] args){

    //create a new object
    MyDate date = new MyDate();
    MyDate date2 = new MyDate();

    //defining values for date object
    date.setDay(5);
    date.setMonth(9);
    date.setYear(2024);

    // defining values for date2 object
    date2.setDay(20);
    date2.setMonth(12);
    date2.setYear(2023);


    //getting output for object date
   System.out.println(date.displayDate());

   //getting the output for object date2
    System.out.println(date2.displayDate());
  }
}
