package Person2;

public class CustomerTest
{
  public static void main(String[] args)
  {
    Customer customer = new Customer("Alice", "123 Main St", "555-1234", 1001, true);
    System.out.println("Customer Info:");
    System.out.println(customer);


    PreferredCustomer preferredCustomer1 = new PreferredCustomer("Bob", "456 Elm St", "555-5678", 1002, false, 450);
    System.out.println("\nPreferred Customer Info:");
    System.out.println(preferredCustomer1);

    preferredCustomer1.setPurchasedAmount(700);
    System.out.println("\nUpdated Preferred Customer Info (after purchases):");
    System.out.println(preferredCustomer1);
  }
}
