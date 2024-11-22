public class BrainTest
{
  public static void main(String[] args)
  {
    MyDate birthday = new MyDate(2, 7, 2000);
    // Brain brain = new Brain(); we don't need to have brain because it is linked to person
    Person person1 = new Person("Bob", birthday);

    person1.rememberThis("Nancy is a good girl :)");
    person1.rememberThis("go for a walk");
    person1.rememberThis("have your lunch");
    System.out.println(person1.getIQ());
  }
}
