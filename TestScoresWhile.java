import java.util.Scanner;
 public class TestScoreWhile
 {
  public static void main(String[]args)
  {
    int numOfTests;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("input how many score you are trying to compute - ");

    numOfTests = keyboard.nextInt();

    int max = 0;
    int Count = 0;
    while (count < numOfTests)
    {
      System.out.print("input test score - ");
      int score = keyboard.nextInt();
       if (Score > max)
        max = score;
    count++;
    }

    System.out.print(max);
  }
 }

