package Student;

import java.io.*;

public class StudentReadFile
{
  public static void main(String[] args)
  {
    try
    {
      FileInputStream fileInput = new FileInputStream(
          "lesson24/src/Student/student.bin");

      ObjectInputStream read = new ObjectInputStream(fileInput);
      while (true)
      {
        try
        {
          Student student = (Student) read.readObject();
          System.out.println(student);
        }
        catch (EOFException e)
        {
          System.out.println("End of file");
          break;
        }
      }
      read.close();

    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
      System.exit(1);
    }
    catch (IOException e)
    {
      System.out.println("IO error reading to file");
      System.exit(1);

    }
    catch (ClassNotFoundException e)
    {
      System.out.println("Class not found");
    }
  }

}
