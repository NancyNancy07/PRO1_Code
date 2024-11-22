public class Payroll
{

  //define attributes
  private String name;
  private double payRate;
  private double hours;
  private final double gross;

  //constructors

  //no argument constructor
//  public Payroll()
//  {
//    name = "Nancy";
//    payRate = 200;
//    hours = 20;
//    gross = payRate * hours;
//  }

  // with arguments constructor
  public Payroll(String name,  double payRate, double hours){
    this.name = name;
    this.payRate = payRate;
    this.hours = hours;
    this.gross = payRate * hours;
  }

  // set methods
  public void setName(String n)
  {
    name = n;
  }

  public void setPayRate(double pay)
  {
    payRate = pay;
  }

  public void setHours(double h)
  {
    hours = h;
  }

  //get methods
  public String getName()
  {
    return name;
  }

  public double getPayRate()
  {
    return payRate;
  }

  public double getHours()
  {
    return hours;
  }

  public double grossPay()
  {
    return payRate * hours;
  }

  // show result from created object
  public String toString()
  {
    return "Name: " + name + "\n" + "PayRate: " + payRate + "\n" + "Hours: "
        + hours + "\n" + "GrossPay: " + gross;
  }
}

