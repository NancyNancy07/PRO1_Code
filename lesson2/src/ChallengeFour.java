import java.util.Scanner;

public class ChallengeFour
{
  public static void main(String[] args){
    Scanner userData = new Scanner(System.in);  //create a Scanner object
    System.out.println("What is your name?");
    String name = userData.nextLine();

    System.out.println("Your age? ");
    int age = userData.nextInt();
    userData.nextLine();
    System.out.println("Your address? ");
    String address = userData.nextLine();


    System.out.println("Hi " + name + "\n" + age + "\n" + address);
  }
}
