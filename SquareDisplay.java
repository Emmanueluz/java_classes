import java.util.Scanner;
 public class SquareDisplay
 {
  public static void main(String[]args)
  {
    int num;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("input any number between 1 and 15 : ");

    num = keyboard.nextInt();

    while (num < 1 || num > 15)
    {
    System.out.println("invalid number");
    System.out.print("input any number :");
    num = keyboard.nextInt();
    }


    for (int count = 0; count < num; count++)
    {
      for (int column = 0; column < num; column++)
      {
	   System.out.print("x");
      }
     System.out.print("\n");
    }
   }
  }
