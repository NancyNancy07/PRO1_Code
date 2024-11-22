public class Notebook
{
  private Note[] notes;
  private int numberOfNotes;

  public Notebook(int maxNumberOfNotes)
  {
    notes = new Note[maxNumberOfNotes];
    numberOfNotes = 0;
  }

  public int getNumberOfNotes()
  {
    return numberOfNotes;
  }

  public Note getNote(int index)
  {
    if (index < numberOfNotes)
    {
      return notes[index].copy();
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
      return notes[index].getMessage();
    }
    else
    {
      return "";
    }
  }

  public void addNote(Note note)
  {
    //another method
   /* if (numberOfNotes < notes.length)
    {
      notes[numberOfNotes] = note.copy();
      numberOfNotes++;
    }*/
    for (int i = 0; i < notes.length; i++)
    {
      if (notes[i] == null)
      {
        notes[i] = note;
        numberOfNotes++;
        break;
      }
    }
  }

  public void addNote(String message)
  {
    //create a note
    Note noteToAdd = new Note(message);
    for (int i = 0; i < notes.length; i++)
    {
      if (notes[i] == null)
      {
        notes[i] = noteToAdd;
        numberOfNotes++;
        break;
      }
    }
  }

  public void addHigherPriorityNote(String message)
  {
    Note noteToAdd = new Note(message);
    noteToAdd.setToHighPriority();

    for (int i = 0; i < notes.length; i++)
    {
      if (notes[i] == null)
      {
        notes[i] = noteToAdd;
        numberOfNotes++;
        break;
      }
    }
  }

  public void removeNote(int index)
  {

    //remove note
    for (int i = 0; i < numberOfNotes; i++)
    {
      notes[i] = notes[i + 1];
    }
    if (numberOfNotes>0){

    notes[index] = null;
    }
    numberOfNotes--;
  }

  public Note[] getAllNotes()
  {
    return notes;
  }

  public int getNumberOfHighPriorityNotes()
  {
    int count = 0;
    for (int i = 0; i < notes.length; i++)
    {
      if (notes[i] != null && notes[i].isHighPriority())
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
    for (int i = 0; i < notes.length; i++)
    {
      if (notes[i] != null && notes[i].isHighPriority())
      {
        allHNotes[count] = notes[i];
        count++;
      }
    }
    return allHNotes;
  }

  public String toString()
  {
    String rtnString = "";
    for (int i = 0; i < notes.length; i++)
    {
      if (notes[i] != null)
      {
        rtnString += notes[i];
      }
    }
    return rtnString;
  }
}
