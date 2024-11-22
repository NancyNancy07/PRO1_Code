package Notebook;

import java.util.ArrayList;

public class Notebook
{
  private ArrayList<Note> notes;

  public Notebook(int maxNumberOfNotes)
  {
    notes = new ArrayList<>(maxNumberOfNotes);
  }
}
