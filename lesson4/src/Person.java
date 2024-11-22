public class Person
{

  //attributes
  private String name;
  private String birthday;


  //constructor

  //no argument constructor
//  public Person (){
//    name = "Nancy";
//    birthday = "17 July";
//  }

  // with arguments constructor
  public Person(String name, String birthday){
    this.name = name;
    this.birthday = birthday;
  }

  //methods

  //set the methods
  public void setName(String personName){
    name = personName;
  }
  public void setBirthday(String personBirthday){
    birthday = personBirthday;
  }

  //get the methods
  public String getName(){
    return name;
  }

  public String getBirthday(){
    return birthday;
  }

  // get the result from created object
  public String toString(){
    return "Name: " + name + "\n" + "Birthday: " + birthday;

  }
}
