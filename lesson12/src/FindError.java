public class FindError
{
  //initial code
  /*1. class Sample
{
double d, s;
public void display()
{
d = 5.7;
s = Math.sqrt(d);
System.out.println(s);
}
}*/

  //missing static and main keyword
  //it should be Math.sqrt()


  /* 2. public class TwoValues
{
private int x, y;
public TwoValues()
{
x = 0;
}
public TwoValues()
{
x = 0;
y = 0;
}
}*/

  //having same two no-argument constructors
  // (it should have either different parameters or only one constructor with no-argument
  //missing value for y in first constructor


  /* 3. public class MyMath
{
public static int square(int number)
{
return number * number;
}
public static double square(int number)
{
return number * number;
}
}*/

  //we can not have the same methods name(square) with same parameter type (int)
}
