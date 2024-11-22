public class GolfArray
{
  public static void main(String[] args)
  {
    int[] array1 = {3, 5, 1, 3, 3, 2, 4, 2, 3};
    int holeInOneCounter = 0; //counting how many elements in an array
    int total = 0;
    double average;

    for (int i = 0; i < array1.length; i++)
    {
      total += array1[i];

      if (array1[i] == 1)
      {
        holeInOneCounter++;
      }
    }
    average = (double) total / array1.length;

    System.out.println("The total number of hits: " + total);
    System.out.println("The average hits per hole: " + average);
    System.out.println("The number of Hole-in-Ones: " + holeInOneCounter);
  }
}
