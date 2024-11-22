public class TVSeriesTest
{
  public static void main(String[] args)
  {
    TVSeries tvSeries = new TVSeries("Love");

    Actor actor1 = new Actor("SRK");
    Actor actor2 = new Actor("SK");
    Actor actor3 = new Actor("RK");
    Actor actor4 = new Actor("HK");

    tvSeries.hireActor(actor1);
    tvSeries.hireActor(actor2);
    tvSeries.hireActor(actor3);
    tvSeries.hireActor(actor4);

    tvSeries.awardEmmy("RK");
    tvSeries.awardEmmy("SRK");

    System.out.println(tvSeries);

    for (int i = 0; i < tvSeries.getEmmyWinners().size(); i++)
    {
      System.out.println(tvSeries.getEmmyWinners().get(i).getName());
    }
  }
}
