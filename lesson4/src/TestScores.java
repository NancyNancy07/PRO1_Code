public class TestScores
{
  private double test1;
  private double test2;
  private double test3;

  //constructor

  public TestScores(double test1, double test2, double test3)
  {
    this.test1 = test1;
    this.test2 = test2;
    this.test3 = test3;
  }

  //mutator (sets)

  public void setTest1(double t1)
  {
    test1 = t1;
  }

  public void setTest2(double t2)
  {
    test2 = t2;
  }

  public void setTest3(double t3)
  {
    test3 = t3;
  }

  //accessor (gets)
  public double getTest1()
  {
    return test1;
  }

  public double getTest2()
  {
    return test2;
  }

  public double getTest3()
  {
    return test3;
  }

  //methods
  public double average()
  {
    return (double) (test1 + test2 + test3) / 3;
  }

  public String toString()
  {
    return "Test1: " + test1 + "\n" + "Test2: " + test2 + "\n" + "Test3: "
        + test3 + "\n" + "Average: " + average();

  }
}
