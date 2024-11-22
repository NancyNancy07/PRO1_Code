package TextFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFile
{
  public static void main(String[] args)
  {
    Scanner read = null;
    try
    {
    FileInputStream fileInput = new FileInputStream("lesson24/src/TextFile/friends.txt");

    read = new Scanner(fileInput);
    }
    catch (FileNotFoundException e){
      System.out.println("File not found, or could not be opened");
      System.exit(1);
    }

    while (read.hasNext()){
      System.out.println(read.nextLine());
    }
    read.close();
  }
}
