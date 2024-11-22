package Person2;

public class Customer extends Person
{
  private int customerNo;
  private boolean wishForMailingList;

  public Customer(String name, String address, String telephone, int customerNo,
      boolean wishForMailingList)
  {
    super(name, address, telephone);
    this.customerNo = customerNo;
    this.wishForMailingList = wishForMailingList;
  }

  public int getCustomerNo()
  {
    return customerNo;
  }

  public void setCustomerNo(int customerNo)
  {
    this.customerNo = customerNo;
  }

  public boolean isWishForMailingList()
  {
    return wishForMailingList;
  }

  public void setWishForMailingList(boolean wishForMailingList)
  {
    this.wishForMailingList = wishForMailingList;
  }

  public String toString()
  {
    return super.toString() + ", Customer Number: " + customerNo
        + ", On Mailing List: " + wishForMailingList;
  }

}
