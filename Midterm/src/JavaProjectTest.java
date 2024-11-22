public class JavaProjectTest
{
  public static void main(String[] args)
  {
    JavaProject javaProject = new JavaProject("Midterm");

    JavaFile javaFile1 = new JavaFile("test1");
    JavaFile javaFile2 = new JavaFile("test2");
    JavaFile javaFile3 = new JavaFile("test3");
    JavaFile javaFile4 = new JavaFile("test4");
    JavaFile javaFile5 = new JavaFile("test5");

    javaFile2.addAMainMethod();
    javaFile3.addAMainMethod();
    javaFile5.addAMainMethod();

    javaProject.addJavaFile(javaFile1);
    javaProject.addJavaFile(javaFile2);
    javaProject.addJavaFile(javaFile3);
    javaProject.addJavaFile(javaFile4);
    javaProject.addJavaFile(javaFile5);

    JavaFile mainMethodFile = javaProject.getFirstJavaFileWithAMainMethod();

      System.out.println(mainMethodFile);

  }
}