import java.util.ArrayList;

public class SiteCollection
{
  private int size;
  private ArrayList<Website> websites;

  public SiteCollection(int maxSites)
  {
    size = maxSites;
    websites = new ArrayList<>();
  }

  public int getNumberOfSites()
  {
    return websites.size();
  }

  public int getNumberOfUpdatedSites()
  {
    int count = 0;
    for (int i = 0; i < websites.size(); i++)
    {
      if (!websites.get(i).needsUpdate())
      {
        count++;
      }

    }
    return count;
  }

  public void addSite(Website site)
  {
    websites.add(site);
  }

  public void removeSite(String url)
  {
    websites.remove(url);
  }

  public Website[] getAllSites()
  {
    Website[] tempArr = new Website[websites.size()];
    Website[] arr = websites.toArray(tempArr);
    return arr;
  }

  public Website[] getAllNotUpdatedSites()
  {

    ArrayList<Website> notUpdatedList = new ArrayList<>();

    for (int i = 0; i < websites.size(); i++)
    {
      if (websites.get(i).needsUpdate())
      {
        notUpdatedList.add(websites.get(i));
      }
    }
    return notUpdatedList.toArray(new Website[0]);
  }

  public String toString()
  {
    String rtnString = "";
    for (int i = 0; i < websites.size(); i++)
    {
      rtnString += websites.get(i);
    }
    return rtnString;
  }

}

