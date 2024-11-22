public class SiteAdministrator
{
  private String name;
  private SiteCollection siteCollection;

  public SiteAdministrator(String name)
  {
    this.name = name;
    siteCollection = new SiteCollection(5);
  }

  public String getName()
  {
    return name;
  }

  public SiteCollection getSiteCollection()
  {
    return siteCollection;
  }

  public Website getNextSiteToUpdate()
  {
    return siteCollection.getAllNotUpdatedSites()[0];
  }

  public Website[] getAllSitesToUpdate()
  {
    return siteCollection.getAllNotUpdatedSites();
  }

}
