import java.util.Scanner;

public class RoomCarpetTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter Dimension for length");
    double length = input.nextDouble();

    System.out.println("Enter Dimension for width");
    double width = input.nextDouble();

    System.out.println("Enter cost for carpet per sq. mt.");
    double cost = input.nextDouble();

    RoomDimension dimension = new RoomDimension(length, width);
    RoomCarpet carpetCost = new RoomCarpet(dimension, cost);

    System.out.println(carpetCost);

  }
}
