import java.util.Scanner;

public class ChallengeEight
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Total purchased shares?");
    double purchasedShares = input.nextDouble();

    System.out.println("One purchase share?");
    double onePurchaseShare = input.nextDouble();

    System.out.println("Purchased Commission?");
    double purchasedCommission = input.nextDouble();

    System.out.println("Total sold shares");
    double soldShares = input.nextDouble();

    System.out.println("One sold share?");
    double oneSoldShare = input.nextDouble();

    System.out.println("Sold Commission?");
    double soldCommission = input.nextDouble();

    double purchasedMoney = purchasedShares * onePurchaseShare;
    double soldMoney = soldShares * oneSoldShare;

    System.out.println("Purchased Money:  " + purchasedMoney);
    System.out.println("Purchased Commission: " + purchasedCommission);
    System.out.println("Sold Money " + soldMoney);
    System.out.println("Sold Commission: " + soldCommission);
    System.out.println(soldMoney - (purchasedMoney - purchasedCommission
            + soldCommission));

  }

}
