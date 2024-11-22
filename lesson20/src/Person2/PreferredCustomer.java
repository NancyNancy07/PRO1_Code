package Person2;

public class PreferredCustomer extends Customer
{
  private double purchasedAmount;
  private double discountLevel;

  public PreferredCustomer(String name, String address, String telephone,
      int customerNo, boolean wishForMailingList, double purchasedAmount)
  {
    super(name, address, telephone, customerNo, wishForMailingList);
    this.purchasedAmount = purchasedAmount;
  }

  public double getPurchasedAmount()
  {
    return purchasedAmount;
  }

  public void setPurchasedAmount(double purchasedAmount)
  {
    this.purchasedAmount = purchasedAmount;
    setDiscountLevel();
  }

  public double getDiscountLevel()
  {
    return discountLevel;
  }

  public void setDiscountLevel()
  {
    if (purchasedAmount >= 2000)
    {
      discountLevel = 0.10;
    }
    else if (purchasedAmount >= 1500)
    {
      discountLevel = 0.07;
    }
    else if (purchasedAmount >= 1000)
    {
      discountLevel = 0.06;
    }
    else if (purchasedAmount >= 500)
    {
      discountLevel = 0.05;
    }
    else
    {
      discountLevel = 0.0;
    }
  }

  public String toString()
  {
    return super.toString() + ", Purchase Amount: " + purchasedAmount
        + ", Discount Level: " + (discountLevel * 100) + "%";
  }
}
