public class Student
{
  //attributes
  private String name;
  private char gender;
  private int studentNumber;

  //constructor
  public Student(String name, char gender, int studentNumber)
  {
    this.name = name;
    this.gender = gender;
    this.studentNumber = studentNumber;
  }

  public Student(String name, char gender)
  {
    this.name = name;
    this.gender = gender;
    this.studentNumber = 0;
  }

  //mutators(sets)
  public void setName(String n)
  {
    name = n;
  }

  public void setGender(char g)
  {
    gender = g;
  }

  public void setStudentNumber(int s)
  {
    studentNumber = s;
  }

  //accessor (gets)
  public String getName()
  {
    return name;
  }

  public char getGender()
  {
    return gender;
  }

  public int getStudentNumber()
  {
    return studentNumber;
  }

  public String toString()
  {
    return "\"" + name + ", '" + gender + "', " + studentNumber + "\"";
  }
  /*public String toString()
  {
    return "Student details " + "\n" + "Name: " + name + "\n" + "Gender: "
        + gender + "\n" + "Student Number: " + studentNumber;
  }*/
}
