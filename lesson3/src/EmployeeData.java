public class EmployeeData
{
  public static void main(String[] args){
    //creating objects
    Employee employee1 = new Employee();
    Employee employee2 = new Employee();
    Employee employee3 = new Employee();

    //adding values
    employee1.setName("Susan Meyers");
    employee2.setName("Mark Jones");
    employee3.setName("Joy Rogers");

    employee1.setIdNumber(47899);
    employee2.setIdNumber(39119);
    employee3.setIdNumber(81774);

    employee1.setDepartment("Accounting");
    employee2.setDepartment("IT");
    employee3.setDepartment("Manufacturing");

    employee1.setPosition("Vice President");
    employee2.setPosition("Programmer");
    employee3.setPosition("Engineer");

    //getting output
    System.out.println("Name");
    System.out.println(employee1.getName());
    System.out.println(employee2.getName());
    System.out.println(employee3.getName());

    System.out.println("ID Number");
    System.out.println(employee1.getIdNumber());
    System.out.println(employee2.getIdNumber());
    System.out.println(employee3.getIdNumber());

    System.out.println("Department");
    System.out.println(employee1.getDepartment());
    System.out.println(employee2.getDepartment());
    System.out.println(employee3.getDepartment());

    System.out.println("Position");
    System.out.println(employee1.getPosition());
    System.out.println(employee2.getPosition());
    System.out.println(employee3.getPosition());


  }
}
