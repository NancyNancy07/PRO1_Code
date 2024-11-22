import java.util.Scanner;

public class BookTest
{
  public static void main(String[] args)
  {

    //created a Scanner for getting input from user
    Scanner input = new Scanner(System.in);

    //defining variables to get information from user
    System.out.println("Author Name?");
    String author = input.nextLine();

    System.out.println("Title?");
    String title = input.nextLine();

    System.out.println("Price");
    double price = input.nextDouble();

    System.out.println("Pages");
    int pages = input.nextInt();
    input.nextLine();

    //defining variables to get information from user
    System.out.println("Author Name?");
    String author2 = input.nextLine();

    System.out.println("Title?");
    String title2 = input.nextLine();

    System.out.println("Price");
    double price2 = input.nextDouble();

    System.out.println("Pages");
    int pages2 = input.nextInt();

    //create object with the input
    Book bookData = new Book(author, title, price, pages);
    Book bookData2 = new Book(author2, title2, price2, pages2);

    bookData.setPrice(bookData.getPrice() * 0.8);

    //display data from object
    System.out.println(bookData);
    System.out.println(bookData2);

  }

}
