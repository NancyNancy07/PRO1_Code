public class DriverExamTest
{
  public static void main(String[] args)
  {
    String[] studentAnswers = {"B", "D", "A", "A", "C", "A", "B", "A", "D", "D",
        "B", "C", "D", "A", "D", "C", "C", "B", "C", "A"};

    DriverExam exam = new DriverExam(studentAnswers);

    System.out.println("Passed: " + exam.passed());
    System.out.println("Total Correct: " + exam.totalCorrect());
    System.out.println("Total Incorrect: " + exam.totalIncorrect());

    int[] missedQuestions = exam.questionMissed();

    for (int i = 0; i < missedQuestions.length; i++)
    {
      System.out.println(missedQuestions[i]);
    }
  }
}
