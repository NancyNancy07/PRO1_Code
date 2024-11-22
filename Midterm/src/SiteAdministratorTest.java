public class SiteAdministratorTest
{
  public static void main(String[] args)
  {
    SiteAdministrator siteAdministrator = new SiteAdministrator("Google");

    SiteCollection siteCollection = siteAdministrator.getSiteCollection();

    Website website1 = new Website("hello.com");
    Website website2 = new Website("world.com");
    Website website3 = new Website("home.com");
    Website website4 = new Website("browse.com");
    website1.markAsNotUpdated();
    website2.markAsUpdated();
    website3.markAsNotUpdated();
    website4.markAsUpdated();

    siteCollection.addSite(website1);
    siteCollection.addSite(website2);
    siteCollection.addSite(website3);
    siteCollection.addSite(website4);

    System.out.println(siteAdministrator.getSiteCollection());

    for (int i = 0; i < siteAdministrator.getAllSitesToUpdate().length; i++)
    {
      System.out.println(siteAdministrator.getAllSitesToUpdate()[i]);

    }

    System.out.println(siteAdministrator.getNextSiteToUpdate());
  }
}
