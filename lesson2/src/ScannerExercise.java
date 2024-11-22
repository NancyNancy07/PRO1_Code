import java.util.Scanner; //import Scanner first
public class ScannerExercise
{
  public static void main(String[] args){
    Scanner userData = new Scanner(System.in);  //create a Scanner object
    System.out.println("What is your name?");
    String name = userData.nextLine();

    System.out.println("How many hours did you work? ");
    int hours = userData.nextInt();

    System.out.println("What is your hourly pay rate? ");
    int payRate = userData.nextInt();

    double pay = hours * payRate;

    System.out.println("Hi " + name + ". Your pay is " + pay);
  }
}
