public class Array2
{
  public static void main(String[] args)
  {
    int[] array1 = {1, 2, 3, 4, 5};

    //copying the array
    int[] array2 = new int[array1.length];
    for (int i = 0; i < array1.length; i++)
    {
      array2[i] = array1[i];
    }

    for (int j = 0; j < array1.length; j++)
    {
      System.out.println(array1[j]);
      System.out.println(array2[j]);
    }
  }
}
