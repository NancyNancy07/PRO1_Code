import java.text.DecimalFormat;

public class PiDecimal
{
  public static void main(String[] args)
  {
    // part b

    double pi = 0;

    // formatting the decimal values
    DecimalFormat f = new DecimalFormat("0.00000");

    // using the predefined pi value
    String realPi = f.format(Math.PI);

    //counter
    int i = 0;
    do
    {

      if (i % 2 == 0)
      {
        pi += 1 / (double) (1 + (2 * i));
      }
      else
      {
        pi -= 1 / (double) (1 + (2 * i));
      }

      System.out.println(4 * pi);

      //increasing by 1
      i++;
    }

    while (!f.format(4 * pi).equals(realPi));
  }
}
