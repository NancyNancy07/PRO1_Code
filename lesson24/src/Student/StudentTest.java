package Student;

import java.io.*;

public class StudentTest
{
  public static void main(String[] args)
  {
    try
    {
      FileOutputStream fileOutput = new FileOutputStream(
          "lesson24/src/Student/student.bin");
      ObjectOutputStream write = new ObjectOutputStream(fileOutput);

      write.writeObject(new Student("Nancy", "No Last Name", "India"));
      write.writeObject(new Student("Bob", "Some Last name", "Denmark"));
      write.writeObject(new Student("John", "Watson", "England"));
      write.close();
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found, or not opened");
    }
    catch (IOException e)
    {
      System.out.println("IO error writing to file");
    }
    System.out.println("Done writing");
  }
}
