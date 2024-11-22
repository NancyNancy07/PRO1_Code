public class Person
{

  //attributes
  private String name;
  private String address;
  private MyDate birthday;
  private Brain brain;
  //constructor

  public Person(String name, String address, MyDate birthday)
  {
    this.name = name;
    this.birthday = birthday.copy();
    this.address = null;
    this.brain = new Brain(); //making copy in each constructor even not in diagram
  }

  public Person(String name, MyDate birthday)
  {
    this.name = name;
    this.birthday = birthday.copy();
    this.address = null;
    this.brain = new Brain(); //making copy in each constructor even not in diagram
  }

  public Person(MyDate birthday)
  {
    this.name = null;
    this.birthday = birthday.copy();
    this.address = null;
    this.brain = new Brain(); //making copy in each constructor even not in diagram
  }
  //methods

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getAddress()
  {
    return address;
  }

  public void setAddress(String address)
  {
    this.address = address;
  }

  public MyDate getBirthday()
  {
    return birthday.copy();
  }

  public int getAge()
  {
    int age = MyDate.today().getYear() - birthday.getYear();
    if (birthday.getMonth() < MyDate.today().getMonth()
        || birthday.getMonth() == MyDate.today().getMonth()
        && birthday.getDay() < MyDate.today().getDay())
    {
      return age;
    }
    return age - 1;
  }

  public int getIQ()
  {
    return brain.getIQ();
  }

  public boolean isBrainDamaged()
  {
    return brain.isBrainDamaged();
  }

  public boolean doYouRemember(String topic)
  {
    return brain.recall(topic);
  }

  public void rememberThis(String topic)
  {
    if (!brain.recall(topic))
    {
      brain.remember(topic);

    }
    else
    {
      brain.refreshMemory(topic);
    }
  }

  public String whatAreYouThinkingAbout()
  {
    return brain.recall();
  }

  // get the result from created object
  public String toString()
  {
    return "Name: " + name + "\n" + "Birthday: " + birthday + "\nAddress: "
        + address;

  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Person other = (Person) obj;
    return name.equals(other.name) && birthday.getDay() == other.getBirthday()
        .getDay() && birthday.getMonth() == other.getBirthday().getMonth()
        && birthday.getYear() == other.getBirthday().getYear();
  }
}
