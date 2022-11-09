import java.util.Scanner;
import javax.swing.JOptionPane;
 public class TestScoreWhile
 {
  public static void main(String[]args)
  {
    int numOfTests;

    Scanner keyboard = new Scanner(System.in);
    String input;

    input = JOptionPane.showInputDialog("input how many score you are trying to compute - ");

    numOfTests = Integer.parseInt(input);

    int max = 0;
    int count = 0;
    while (count < numOfTests)
    {
      String score = JOptionPane.showInputDialog("input test score - ");
      int score1 = Integer.parseInt(score);
       if (score1 > max)
        max = score1;
    count++;
    }

    JOptionPane.showMessageDialog(null,"The max number is " + max);
  }
 }

