public class KindergartenTest
{
  public static void main(String[] args)
  {
    Kindergarten kindergarten = new Kindergarten();

    Child child1 = new Child("Harry", 5);
    Child child2 = new Child("John", 1);
    Child child3 = new Child("Ella", 3);
    Child child4 = new Child("Emmy", 2);
    Child child5 = new Child("Carry", 4);
    Child child6 = new Child("Roo", 4);

    kindergarten.addChild(child1);
    kindergarten.addChild(child2);
    kindergarten.addChild(child3);
    kindergarten.addChild(child4);
    kindergarten.addChild(child5);
    kindergarten.addChild(child6);

    kindergarten.hireTeachers(2);

    kindergarten.celebrateBirthday("Harry");

    System.out.println(kindergarten);

  }
}
