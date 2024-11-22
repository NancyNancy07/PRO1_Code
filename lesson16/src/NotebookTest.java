public class NotebookTest
{
  public static void main(String[] args)
  {
    Notebook myNotebook = new Notebook(5);

    myNotebook.addNote("My first note");
    myNotebook.addNote("My second note");
    myNotebook.addNote("My third note");
    myNotebook.addNote("My forth note");
    myNotebook.addHigherPriorityNote("1 priority note");

    System.out.println(myNotebook);
/*    Note[] higherPriorityNotes = myNotebook.getAllHigherPriorityNotes();
    for (int i = 0; i < higherPriorityNotes.length; i++)
    {
      System.out.println(higherPriorityNotes[i]);
    }*/
  }
}
