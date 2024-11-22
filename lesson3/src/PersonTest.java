//define the class
public class PersonTest {
  // define the main method
  public static void main(String[] args){

   //creating object(person1) from "Person" class
    Person person1 = new Person();
    person1.setName("Nancy");
    person1.setBirthday("17 july");

    //output the data
    System.out.println(person1.getName());
    System.out.println(person1.getBirthday());

  }
}
