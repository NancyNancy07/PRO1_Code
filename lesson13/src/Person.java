public class Person
{

  //attributes
  private String name;
  private Address address;
  private MyDate birthday;

  //constructor

  public Person(String name, Address address, MyDate birthday)
  {
    this.name = name;
    this.birthday = birthday.copy();
    this.address = null;

  }

  public Person(String name, MyDate birthday)
  {
    this.name = name;
    this.birthday = birthday.copy();
    this.address = null;
  }

  public Person(MyDate birthday)
  {
    this.name = null;
    this.birthday = birthday.copy();
    this.address = null;
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

  public Address getAddress()
  {
    return address;
  }

  public void setAddress(Address address)
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
