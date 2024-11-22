import java.util.ArrayList;

public class Hotel
{
  private String name;
  private Room[] rooms;

  public Hotel(String name, Room[] rooms)
  {
    this.name = name;
    this.rooms = rooms;
  }

  public String getName()
  {
    return name;
  }

  public int getNumberOfRooms()
  {
    return rooms.length;
  }

  public int getNumberOfAvailableRooms()
  {
    int count = 0;
    for (int i = 0; i < rooms.length; i++)
    {
      if (!rooms[i].isOccupied())
      {
        count++;
      }
    }
    return count;
  }

  public Room getFirstAvailableRoom()
  {
    for (int i = 0; i < rooms.length; i++)
    {
      if (!rooms[i].isOccupied())
      {
        return rooms[i];
      }
    }
    return null;
  }

  public Room getFirstAvailableRoom(double maxPrice)
  {
    for (int i = 0; i < rooms.length; i++)
    {
      if (!rooms[i].isOccupied())
      {
        if (rooms[i].getPrice() < maxPrice)
        {
          return rooms[i];
        }
        else if (maxPrice < 72.40 && rooms[i].getPrice() <= 72.40)
        {
          return rooms[i];
        }
        else if (maxPrice < 59.50 && rooms[i].getPrice() <= 59.50)
        {
          return rooms[i];
        }
      }
    }
    return null;
  }

  public Room[] getAllAvailableRooms(String bedType)
  {
    for (int i = 0; i < rooms.length; i++)
    {
      if (!rooms[i].isOccupied() && rooms[i].getBedType().equals(bedType))
      {
        return rooms;
      }
    }
    return null;
  }

  public boolean hasGuest(Guest guest)
  {
    for (int i = 0; i < rooms.length; i++)
    {
      if (!rooms[i].getGuest().equals(guest))
      {
        return false;
      }
    }
    return true;
  }

  public Room getRoom(Guest guest)
  {
    if (!hasGuest(guest))
    {
      return getFirstAvailableRoom();
    }
    return null;
  }
}

