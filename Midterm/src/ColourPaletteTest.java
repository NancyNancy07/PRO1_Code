public class ColourPaletteTest
{
  public static void main(String[] args)
  {
    ColourPalette colourPalette = new ColourPalette(5);
    ColourPalette colourPalette2 = new ColourPalette(5);

    colourPalette.add(new Colour(255, 0, 0));
    colourPalette.add(new Colour(0, 255, 0));
    colourPalette.add(new Colour(0, 0, 255));
    colourPalette.add(new Colour(255, 255, 255));

    colourPalette2.add(new Colour(255, 0, 0));
    colourPalette2.add(new Colour(0, 255, 0));
    colourPalette2.add(new Colour(0, 0, 255));
    colourPalette2.add(new Colour(255, 255, 255));

    System.out.println(colourPalette);

    colourPalette.mixColour(2, new Colour(255, 0, 0));
    System.out.println(colourPalette.equals(colourPalette2));
    System.out.println(colourPalette);

  }
}
