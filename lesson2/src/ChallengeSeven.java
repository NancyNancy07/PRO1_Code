import java.util.Scanner;

public class ChallengeSeven
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int purchasedShares = 1000;
    double onePurchaseShare = 32.87;
    double purchasedCommission = 0.02;

    int soldShares = 1000;
    double oneSoldShare = 33.92;
    double soldCommission = 0.02;

    double purchasedMoney = purchasedShares * onePurchaseShare;
    double soldMoney = soldShares * oneSoldShare;
    System.out.println("Purchased " + purchasedMoney);
    System.out.println(purchasedCommission);
    System.out.println("Sold " + soldMoney);
    System.out.println(soldCommission);
    System.out.println(
        soldMoney - (purchasedMoney - purchasedCommission + soldCommission));

  }

}
