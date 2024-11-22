public class FibonacciNumber
{
  public static void main(String[] args)
  {
    int n;
    int num1 = 1;
    int num2 = 1;
    for (int i = 0; i < 20; i++)
    {
      if (i == 0 || i == 1)
      {
        n = 1;
        System.out.println("Fibonacci(" + i + ") = " + n);
      }

      else
      {
        n = num1 + num2;
        System.out.println("Fibonacci(" + i + ") = " + n);

        //updating value for numbers
        num1 = num2;
        num2 = n;

      }
    }

  }
}
