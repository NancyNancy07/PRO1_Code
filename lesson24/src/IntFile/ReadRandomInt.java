package IntFile;

import java.io.*;

public class ReadRandomInt
{
  public static void main(String[] args)
  {
    try
    {
      FileInputStream fileInput = new FileInputStream(
          "lesson24/src/IntFile/randomInt.bin");

      ObjectInputStream read = new ObjectInputStream(fileInput);

      while (true)
      {
        try
        {
          int x = read.readInt();
          System.out.println(x);
        }
        catch (EOFException e)
        {
          System.out.println("End of File");
          break;
        }

      }
      read.close();
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found, or not opened");
      System.exit(1);
    }
    catch (IOException e)
    {
      System.out.println("IO error reading file");
      System.exit(1);
    }
  }
}
