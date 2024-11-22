public class Job
{
  //attributes
  private String title;
  private double salary;
  private Person employee;


  //constructors
  public Job(String title, double salary, Person employee)
  {
    this.title = title;
    this.salary = salary;
    this.employee = employee;
  }

  public Job(String title, double salary)
  {
    this.title = title;
    this.salary = salary;
    this.employee = null;
  }

  //set mutators methods

  public void setTitle(String title)
  {
    this.title = title;
  }

  public void setSalary(double salary)
  {
    this.salary = salary;
  }

  public void setEmployee(Person employee)
  {
    this.employee = employee;
  }

  //get accessor methods
  public String getTitle()
  {
    return title;
  }

  public double getSalary()
  {
    return salary;
  }

  public Person getEmployee()
  {
    return employee;
  }

  public void givePercentageRaise(double percentage)
  {
    salary = salary + (salary * percentage / 100);
  }

  public String toString()
  {
    return "Job: " + title + "\n" + "Salary: " + salary + "\n" + "Employee: "
        + employee + "\n";
  }
}
