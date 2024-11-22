public class Payroll
{

  //define attributes
  private String name;
  private double payRate;
  private double hours;

  // set methods
  public void setName(String n){
    name = n;
  }
  public void setPayRate(double pay){
    payRate = pay;
  }
  public  void setHours(double h){
    hours = h;
  }

  //get methods
  public String getName(){
    return name;
  }
  public double getPayRate(){
    return payRate;
  }
  public  double getHours(){
    return hours;
  }
  public double grossPay(){
    return payRate * hours;
  }
}
