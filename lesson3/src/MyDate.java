public class MyDate
{
  //define attributes
  private int day;
  private int month;
  private int year;

  //set methods
  public void setDay(int d){
    day = d;
  }
  public  void setMonth(int m){
    month = m;
  }
  public  void setYear(int y){
    year = y;
  }

  //get methods
  public int getDay(){
    return day;
  }
  public int getMonth(){
    return month;
  }
  public int getYear(){
    return year;
  }
  public String displayDate(){
  return day + "/" + month + "/" + year;
  }
}
