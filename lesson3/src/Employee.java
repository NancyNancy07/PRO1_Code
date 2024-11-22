public class Employee
{
  //define attributes
  private String name;
  private int idNumber;
  private String department;
  private String position;

  //set methods
  public void setName(String n){
    name = n;
  }
  public void setIdNumber(int id){
    idNumber = id;
  }
  public void setDepartment(String d){
    department = d;
  }
  public void setPosition(String p){
    position = p;
  }

  //get methods
  public String getName(){
    return name;
  }
  public int getIdNumber(){
    return idNumber;
  }
  public String getDepartment(){
    return department;
  }
  public String getPosition(){
    return position;
  }
}
