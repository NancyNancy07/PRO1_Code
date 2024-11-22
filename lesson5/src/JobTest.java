public class JobTest
{
  public static void main(String[] args)
  {

    //create person data from person class
    Person person1 = new Person("Marie", "14/05/2000");
    //two objects
    Job job1Data = new Job("Teacher", 20000, person1);
    Job job2Data = new Job("Developer", 50000);

    job1Data.setSalary(30000);
    job2Data.setTitle("Software Developer");

    job1Data.givePercentageRaise(20);
    //System.out.println(job1Data.getSalary());

    System.out.println(job1Data);
    System.out.println(job2Data);
  }
}
