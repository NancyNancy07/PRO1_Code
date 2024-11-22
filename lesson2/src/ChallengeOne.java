import java.util.Scanner;
public class ChallengeOne
{
  public static void main(String[] args)
  {
    Scanner users = new Scanner(System.in);

    System.out.println("Your favourite city?");

    String city = users.nextLine();

    //length of the city
    int length = city.length();

    //upper case
    String upper = city.toUpperCase();

    //lower case
    String lower = city.toLowerCase();

    //first char
    int firstLetter = city.charAt(2);


    System.out.println(  length+ "\n" + upper + "\n" + lower + "\n" + firstLetter);
  }
}
