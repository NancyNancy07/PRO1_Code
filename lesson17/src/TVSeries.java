import java.util.ArrayList;

public class TVSeries
{
  private ArrayList<Actor> actors;
  private String title;
  private int numberOfEpisodes;

  public TVSeries(String title)
  {
    this.title = title;
    numberOfEpisodes = 0;
    actors = new ArrayList<Actor>();
  }

  public void hireActor(Actor actor)
  {
    actors.add(actor);
  }

  public int getNumberOfActors()
  {
    return actors.size();
  }

  public Actor getActor(int index)
  {
    return actors.get(index);
  }

  public void awardEmmy(String name)
  {
    for (int i = 0; i < actors.size(); i++)
    {
      if (actors.get(i).getName().equals(name))
      {
        actors.get(i).awardEmmy();
        break;
      }
    }
  }

  public void makeNextEpisode()
  {
    numberOfEpisodes++;

    for (int i = 0; i < actors.size(); i++)
    {
      actors.get(i).participateInEpisode();
    }
  }

  public ArrayList<Actor> getEmmyWinners()
  {
    ArrayList<Actor> emmyWinners = new ArrayList<Actor>();

    for (int i = 0; i < actors.size(); i++)
    {
      if (actors.get(i).getNumberOfEmmys() > 0)
      {
        emmyWinners.add(actors.get(i));
      }
    }
    return emmyWinners;
  }

  public String toString()
  {
    String rtnString = "";

    for (int i = 0; i < actors.size(); i++)
    {
      rtnString += "Actor: " + actors.get(i).getName() + "\nEmmy Awards: " + actors.get(i)
          .getNumberOfEmmys() + "\nEpisodes: " + actors.get(i)
          .getNumberOfEpisodes() + "\n";
    }
    return rtnString;
  }
}