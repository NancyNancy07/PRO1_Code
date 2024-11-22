public class ChessGame
{
  public static void main(String[] args)
  {
    double grain = 1;
    double total = 1;
    for (int i = 2; i <= 64; i++)
    {
      grain = 2 * grain;
      total = total + grain;
    }

    System.out.println(
        "Grain at 64 place : " + grain + "\n" + "totalGrain: " + total);

  }
}
