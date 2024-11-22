import java.util.ArrayList;

public class ApartmentComplex
{
  private String address;
  ArrayList<Apartment> apartments;

  public ApartmentComplex(String address)
  {
    this.address = address;
    this.apartments = new ArrayList<>();
  }

  public int getNumberOfApartments()
  {
    return apartments.size();
  }

  public void add(Apartment apartment)
  {
    apartments.add(apartment);
  }

  public Apartment getApartment(int index)
  {
    return apartments.get(index);
  }

  public Apartment
}
