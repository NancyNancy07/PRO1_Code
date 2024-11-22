import java.util.Scanner;

public class ChallengeSix
{
  public static void main(String[] args){
    Scanner userData = new Scanner(System.in);  //create a Scanner object
    System.out.println("What is your name?");
    String name = userData.nextLine();

    System.out.println("Your age? ");
    int age = userData.nextInt();
    userData.nextLine();

    System.out.println("Your city? ");
    String city = userData.nextLine();

    System.out.println("Your college? ");
    String college = userData.nextLine();

    System.out.println("Your profession? ");
    String profession = userData.nextLine();

    System.out.println("Your favourite animal? ");
    String animal = userData.nextLine();

    System.out.println("Your animal name? ");
    String animalName = userData.nextLine();

    System.out.println("There once was a person named " + name +
        " who lives in " + city + ". At yhe age of " + age +
        ", " + name + " went to college at " + college + ". " + name +
        " graduated and went to work as a " + profession + ". Then, " + name +
        " adopted a/an " + animal + " named " + animalName + ". "
        + "They both lived happily ever after!" );
  }
}
