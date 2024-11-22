public class NotebookTest
{
  public static void main(String[] args)
  {
    Notebook myNotebook = new Notebook();

    myNotebook.addNote("My first note");
    myNotebook.addNote("My second note");
    myNotebook.addNote("My third note");
   myNotebook.addNote("My forth note");
    myNotebook.addHigherPriorityNote("1 priority note");
   myNotebook.addHigherPriorityNote("2 priority note");
   myNotebook.addHigherPriorityNote("3 priority note");
//    myNotebook.addHigherPriorityNote("4 priority note");

    System.out.println("Total notes: " + myNotebook.getNumberOfNotes());
    System.out.println(myNotebook.getAllNotes());
  }
}
