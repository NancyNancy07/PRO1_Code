package TextFile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteTextFile
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    PrintWriter writer = null;


    System.out.println("Type file name");
    String fileName = input.nextLine();

    try
    {
      FileOutputStream fileOutput = new FileOutputStream(
          "lesson24/src/TextFile/" + fileName + ".txt");

      writer = new PrintWriter(fileOutput);

    }

    catch (FileNotFoundException e)
    {
      System.out.println("File not found, or could not be opened");
      System.exit(1);
    }
    System.out.println("Type name of friend:");
    String friendName = input.nextLine();
    writer.println(friendName);

    while (!friendName.equals("DONE"))
    {
      System.out.println("Type name of friend:");
      friendName = input.nextLine();
      if(friendName.equals("DONE")){
        break;
      }
      writer.println(friendName);
    }


    System.out.println("Writing data to file...");
    writer.close();

    System.out.println("Done Writing");
  }
}
