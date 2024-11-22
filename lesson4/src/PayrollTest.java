import java.util.Scanner;

public class PayrollTest
{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

   System.out.println("Employee's name?");
   String name = input.nextLine();

    System.out.println("payRate per hour?");
    double payRate = input.nextDouble();

    System.out.println(("worked hours?"));
    double hours = input.nextDouble();

    Payroll payData = new Payroll(name, payRate, hours);
    System.out.println(payData);

  }
}
