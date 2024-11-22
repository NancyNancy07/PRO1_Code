public class JavaFile
{
  private boolean hasAMainMethod;
  private FileName fileName;

  public JavaFile(String fileName)
  {
    this.fileName = new FileName(fileName, "java");
    hasAMainMethod = false;
  }

  public FileName getFileName()
  {
    return fileName;
  }

  public boolean hasAMainMethod()
  {
    return hasAMainMethod;
  }

  public void addAMainMethod()
  {
    hasAMainMethod = true;
  }

  public String toString()
  {
    String rtnString = "FileName: " + fileName + "\n";
    if (hasAMainMethod)
    {
      this.addAMainMethod();
    }
    return rtnString;
  }
}
