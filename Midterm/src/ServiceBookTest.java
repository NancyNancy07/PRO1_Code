public class ServiceBookTest
{
  public static void main(String[] args)
  {
    ServiceBook serviceBook = new ServiceBook();

    Date date1 = new Date();
    Date date2 = new Date(1, 2, 2000);
    Date date3 = new Date(1, 4, 2021);
    Date date4 = new Date(5, 7, 2020);

    Service service1 = new Service(1000, date1);
    Service service2 = new Service(100, date2);
    Service service3 = new Service(400, date3);
    Service service4 = new Service(1030, date4);

    serviceBook.addService(service1);
    serviceBook.addService(service2);
    serviceBook.addService(service3);
    serviceBook.addService(service4);

    System.out.println( serviceBook.getDateOfLastService());
    System.out.println(serviceBook);

    for (int i = 0; i < serviceBook.getAllServicesMileages().length; i++)
    {
      System.out.println(serviceBook.getAllServicesMileages()[i]);
    }
  }
}
