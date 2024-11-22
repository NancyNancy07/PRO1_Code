public class Actor
{
  private String name;
  private int numberOfEmmys;
  private int numberOfEpisodes;

  public Actor(String name)
  {
    this.name = name;
    this.numberOfEmmys = 0;
    this.numberOfEpisodes = 0;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public int getNumberOfEmmys()
  {
    return numberOfEmmys;
  }

  public void awardEmmy()
  {
    this.numberOfEmmys++;
  }

  public int getNumberOfEpisodes()
  {
    return numberOfEpisodes;
  }

  public void participateInEpisode()
  {
    this.numberOfEpisodes++;
  }
}
