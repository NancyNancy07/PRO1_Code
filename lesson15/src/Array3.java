public class Array3
{
  public static void main(String[] args)
  {
    int[] array1 = {2, 3, 4, 5};
    int lengthArray1 = array1.length;
    int[] array2 = new int[lengthArray1 * 2];

    //checking the length of second array
    //    System.out.println(array2.length);

    for (int i = 0; i < array1.length; i++)
    {
      array2[i] = array1[i];
    }

    for (int j = 0; j < array2.length; j++)
    {
      System.out.println(array2[j]);
    }
  }
}
