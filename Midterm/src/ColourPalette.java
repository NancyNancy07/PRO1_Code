import java.util.ArrayList;

public class ColourPalette
{
  private int numberOfColours;
  private ArrayList<Colour> colours;

  public ColourPalette(int maxNumberOfColours)
  {
    this.numberOfColours = maxNumberOfColours;
    colours = new ArrayList<Colour>();
  }

  public int getNumberOfColours()
  {
    return colours.size();
  }

  public void add(Colour colour)
  {
    colours.add(colour);
  }

  public Colour get(int index)
  {
    return colours.get(index);
  }

  public int getNumberOfGrayColours()
  {
    int count = 0;

    for (int i = 0; i < colours.size(); i++)
    {
      if (colours.get(i).isGray())
      {
        count++;
      }
    }
    return count;
  }

  public void mixColour(int index, Colour colour2)
  {
    colours.get(index).mixWith(colour2);
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }

    ColourPalette other = (ColourPalette) obj;

    for (int i = 0; i < colours.size(); i++)
    {
      if (!colours.get(i).equals(other.colours.get(i)))
      {
        return false;
      }
    }
    return true;
  }

  public String toString()
  {
    String rtnString = "";

    for (int i = 0; i < colours.size(); i++)
    {
      rtnString += colours.get(i);
    }
    return rtnString;
  }
}
