import java.util.Scanner;
 public class DoWhilePractice
 {
  public static void main(String[]args)
  {

   double number1, number2, sum;
   String input;
   char repeat;

   Scanner keyboard = new Scanner(System.in);

    do
     {
      System.out.print("input first number : ");
      number1 = keyboard.nextDouble();

      System.out.print("input second number : ");
      number2 = keyboard.nextDouble();

      keyboard.nextLine();

      sum = number1 + number2;

      System.out.println("The sum is " + sum);
      System.out.println("Do you wish to continue, press yes or no : ");
      input = keyboard.nextLine().trim ().toUpperCase();
     }
      while (input.equals("YES"));
      System.out.println("Goodbye");
    }
   }

