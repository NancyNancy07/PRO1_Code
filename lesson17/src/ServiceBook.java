import java.util.ArrayList;

public class ServiceBook
{
  private ArrayList<Service> services;

  public ServiceBook()
  {
    services = new ArrayList<Service>();
  }

  public void addService(Service service)
  {
    services.add(service);
  }

  public int getNumberOfServices()
  {
    return services.size();
  }

  public Service getService(int index)
  {
    return services.get(index);
  }

  public Service[] getAllServices()
  {
    //    Service[] tempArray = new Service[services.size()];
    //    Service[] arr = services.toArray(tempArray);
    //    return arr;
    //another method
    return services.toArray(new Service[0]);
  }

  public int[] getAllServicesMileages()
  {
    ArrayList<Integer> allMileages = new ArrayList<>();
    for (int i = 0; i < services.size(); i++)
    {
      allMileages.add(services.get(i).getMileage());
    }

    int[] arrayMileages = new int[allMileages.size()];
    for (int i = 0; i < allMileages.size(); i++)
    {
      arrayMileages[i] = allMileages.get(i);
    }
    return arrayMileages;
  }

  public boolean hasServiceOnDate(Date date)
  {
    for (int i = 0; i < services.size(); i++)
    {
      if (services.get(i).getDate() == date)
      {
        return true;
      }
    }
    return false;
  }

  public Date getDateOfLastService()
  {
    return services.getLast().getDate();
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    ServiceBook other = (ServiceBook) obj;

    for (int i = 0; i < services.size(); i++)
    {
      if (!services.get(i).equals(other.services.get(i)))
      {
        return false;
      }
    }
    return true;
  }

  public String toString()
  {
    String rtnString = "";

    for (int i = 0; i < services.size(); i++)
    {
      rtnString += services.get(i);
    }
    return rtnString;
  }
}
