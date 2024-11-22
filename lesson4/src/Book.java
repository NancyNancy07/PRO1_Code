public class Book
{
  //fields
  private String author;
  private String title;
  private double price;
  private int pages;

  //constructor with arguments
  public Book(String author, String title, double price, int pages)
  {
    this.author = author;
    this.title = title;
    this.price = price;
    this.pages = pages;

  }

  //get methods
  public String getAuthor()
  {
    return author;
  }

  public String getTitle()
  {
    return title;
  }

  public double getPrice()
  {
    return price;
  }

  public int getPages()
  {
    return pages;
  }

  //set methods
  public void setPrice(double p)
  {
    price = p;
  }

  //result for created object
  public String toString()
  {
    return "Author: " + author + "\n" + "Title: " + title + "\n" + "Price: "
        + price + "\n" + "Pages: " + pages;
  }
}
