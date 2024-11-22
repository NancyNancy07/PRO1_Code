public class Array1
{
  public static void main(String[] args)
  {
    int[] numbers = {1, 2, 3, 4, 5};

    for (int i = 0; i < numbers.length; i++)
    {
      numbers[i] = 2 * numbers[i];
      System.out.println(numbers[i]);
    }

  }
}
