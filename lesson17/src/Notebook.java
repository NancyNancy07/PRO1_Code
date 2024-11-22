import java.util.ArrayList;

public class Notebook
{
  private ArrayList<Note> notes;
  private int numberOfNotes;

  public Notebook()
  {
    notes = new ArrayList<Note>(5);
    numberOfNotes = 5;
  }

  public Notebook(int maxNumberOfNotes)
  {
    numberOfNotes = maxNumberOfNotes;
    notes = new ArrayList<Note>();
  }

  public int getNumberOfNotes()
  {
    return notes.size();
  }

  public Note getNote(int index)
  {
    if (index < numberOfNotes)
    {
      return notes.get(index).copy();
    }
    else
    {
      return null;
    }
  }

  public String getMessage(int index)
  {
    if (index < numberOfNotes)
    {
      return notes.get(index).getMessage();
    }
    else
    {
      return "";
    }
  }

  public void addNote(Note note)
  {
    if (numberOfNotes < notes.size())
    {
      notes.add(note);
      numberOfNotes++;
    }
  }

  public void addNote(String message)
  {
    //create a note
    Note noteToAdd = new Note(message);
    if (numberOfNotes > notes.size())
    {
      notes.add(noteToAdd);
    }
  }

  public void addHigherPriorityNote(String message)
  {
    Note noteToAdd = new Note(message);
    noteToAdd.setToHighPriority();
    if (numberOfNotes > notes.size())
    {
      notes.add(noteToAdd);
    }
  }

  public void removeNote(int index)
  {
    //remove note
    notes.remove(index);

  }

  public ArrayList<Note> getAllNotes()
  {
    return notes;
  }

  public int getNumberOfHighPriorityNotes()
  {
    int count = 0;
    for (int i = 0; i < notes.size(); i++)
    {
      if (notes.get(i) != null && notes.get(i).isHighPriority())
      {
        count++;
      }
    }
    return count;
  }

  public Note[] getAllHigherPriorityNotes()
  {
    Note[] allHNotes = new Note[getNumberOfHighPriorityNotes()];
    int count = 0;
    for (int i = 0; i < notes.size(); i++)
    {
      if (notes.get(i) != null && notes.get(i).isHighPriority())
      {
        allHNotes[count] = notes.get(i);
        count++;
      }
    }
    return allHNotes;
  }

  public String toString()
  {
    String rtnString = "";
    for (int i = 0; i < notes.size(); i++)
    {
      if (notes.get(i) != null)
      {
        rtnString += notes.get(i);
      }
    }
    return rtnString;
  }
}
