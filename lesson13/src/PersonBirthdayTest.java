// import java.util.Scanner;

public class PersonBirthdayTest
{
  public static void main(String[] args)
  {

    MyDate birthday = new MyDate(13, 11, 2000);
    Person person1 = new Person("Nancy", birthday);
    Person person2 = new Person("bob", birthday);


    System.out.println(person1.getAge());
    System.out.println(person1.equals(person2));
    System.out.println(person1);

  }
}
