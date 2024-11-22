import java.util.Scanner;

public class PayrollTest
{
  public static void main(String[] args){
    Payroll payData = new Payroll();
    Scanner input = new Scanner(System.in);


    System.out.println("Employee's name?");
    payData.setName(input.nextLine());

    System.out.println("payrate per hour?");
    payData.setPayRate(input.nextDouble());

    System.out.println(("worked hours?"));
    payData.setHours(input.nextDouble());

    System.out.println("Name: " + payData.getName());
    System.out.println("PayRate: " + payData.getPayRate());
    System.out.println("Hours: " + payData.getHours());
    System.out.println("Employee's gross pay: " + payData.grossPay());
  }
}
