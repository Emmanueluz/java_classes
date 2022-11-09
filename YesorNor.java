import java.util.Scanner;
 public class YesorNor
 {
  public static void main(String[]args)
  {
    String input;
    Scanner keyboard = new Scanner(System.in);

    do
    {
      System.out.print("Type yes to continue and no to end : ");
      input = keyboard.nextLine().trim ().toUpperCase();
    }
    while (!input.equals("YES") && !input.equals("NO"));
    System.out.println("Good Job");
  }
 }