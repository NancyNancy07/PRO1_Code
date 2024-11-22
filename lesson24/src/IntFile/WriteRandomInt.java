package IntFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Random;

public class WriteRandomInt
{
  public static void main(String[] args)
  {
    Random randomNumber = new Random();

    try
    {
      FileOutputStream fileOutput = new FileOutputStream(
          "lesson24/src/IntFile/randomInt.bin");
      ObjectOutputStream write = new ObjectOutputStream(fileOutput);

      for (int i = 0; i < 10; i++)
      {
        write.writeInt(randomNumber.nextInt(0, 15));
      }
      write.close();
    }

    catch (FileNotFoundException e)
    {
      System.out.println("File not found, or not opened");
      System.exit(1);
    }
    catch (IOException e)
    {
      System.out.println("IO error writing to file");
      System.exit(1);
    }

    System.out.println("Done Writing");
  }
}
