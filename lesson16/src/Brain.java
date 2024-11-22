public class Brain
{
  /*  private String activeMemoryItem;
    private String passiveMemoryItemOne;
    private String passiveMemoryItemTwo;*/
  private String[] memoryArray;

  public Brain()
  {
    memoryArray = new String[3];
    memoryArray[0] = "";  //activeMemoryItem
    memoryArray[1] = ""; //passiveMemoryItemOne
    memoryArray[2] = ""; //passiveMemoryItemTwo

    /*this.activeMemoryItem = "";
    this.passiveMemoryItemOne = "";
    this.passiveMemoryItemTwo = "";*/
  }

  public int getIQ()
  {
    int a = memoryArray[0].length();
    int p1 = memoryArray[1].length();
    int p2 = memoryArray[2].length();
    if ((a > 20 && p1 > 10 && p2 > 10) || (p1 > 20 && a > 10 && p2 > 10) || (
        p2 > 20 && p1 > 10 && a > 10))
    {
      return 130;
    }
    else if (a >= 10 && p1 >= 10 && p2 >= 10)
    {
      return 100;
    }
    else
    {
      return 70;
    }
  }

  public boolean isBrainDamaged()
  {
    if (memoryArray[0] == null || memoryArray[1] == null
        || memoryArray[2] == null)
    {
      return true;
    }
    return false;
  }

  public void remember(String info)
  {
    memoryArray[2] = memoryArray[1];
    memoryArray[1] = memoryArray[0];
    memoryArray[0] = info;
  }

  public void refreshMemory(String info)
  {
    if (memoryArray[1].equals(info))
    {
      memoryArray[1] = memoryArray[0];
      memoryArray[0] = info;
    }
    else if (memoryArray[2].equals(info))
    {
      memoryArray[2] = memoryArray[1];
      memoryArray[1] = memoryArray[0];
      memoryArray[0] = info;
    }

  }

  public boolean recall(String info)
  {
    if (info.equals(memoryArray[0]) || info.equals(memoryArray[1])
        || info.equals(memoryArray[2]))
    {
      return true;
    }
    return false;
  }

  public String recall()
  {
    return memoryArray[0];
  }

  public String toString()
  {
    return "Active Memory: " + memoryArray[0] + "\nPassive Memory One: "
        + memoryArray[1] + "\nPassive Memory Two: " + memoryArray[2];
  }

  public boolean equals(Object obj)
  {

    if ((obj == null) || (getClass() != obj.getClass()))
    {
      return false;
    }
    Brain other = (Brain) obj;
    return memoryArray[0].equals(other.memoryArray[0]) && memoryArray[1].equals(
        other.memoryArray[1]) && memoryArray[2].equals(other.memoryArray[2]);
  }

  ///////////////////////////////////////////////// second solution more than 3 memories////////////////////////////////////////
  /*public Brain(int size)
  {
    memoryArray = new String[size];
    for (int i = 0; i < memoryArray.length; i++)
    {
      memoryArray[i] = "";
    }
  }

  public int getIQSecond()
  {
    int a = memoryArray[0].length();
    int p = 0;

    //checking the length of all passive memories
    for (int i = 1; i < memoryArray.length; i++)
    {
      if (memoryArray[i].length() > 10)
      {
        p++;
      }
    }
    if ((a > 20 && (memoryArray.length - 1) > 10) || (p > 1 && a > 10))
    {
      return 130;
    }
    else if (a >= 10 && p > memoryArray.length - 1)
    {
      return 100;
    }
    else
    {
      return 70;
    }

  }

  public boolean isBrainDamagedSecond()
  {
    for (String memoryItem : memoryArray)
    {
      if (memoryItem == null)
      {
        return true;
      }
    }
    return false;
  }

  public void rememberSecond(String info)
  {
    // Shift all items to the right and insert the new info at the start
    for (int i = memoryArray.length - 1; i > 0; i--)
    {
      memoryArray[i] = memoryArray[i - 1];
    }
    memoryArray[0] = info;
  }

  public void refreshMemorySecond(String info)
  {
    // Check if info exists in any of the passive memory items
    for (int i = 1; i < memoryArray.length; i++)
    {
      if (memoryArray[i].equals(info))
      {
        // Shift items down up to the position of the found item
        for (int j = i; j > 0; j--)
        {
          memoryArray[j] = memoryArray[j - 1];
        }
        memoryArray[0] = info;
        break;
      }
    }
  }

  public boolean recallSecond(String info)
  {
    for (String memoryItem : memoryArray)
    {
      if (info.equals(memoryItem))
      {
        return true;
      }
    }
    return false;
  }

  public String recallSecond()
  {
    return memoryArray[0];
  }*/

}
