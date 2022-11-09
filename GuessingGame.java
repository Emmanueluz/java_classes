import java.util.Scanner;
import java.util.Random;
 public class GuessingGame
 {
  public static void main(String[]args)
  {
    int num, rdm;

    Scanner keyboard = new Scanner(System.in);
    System.out.print("input any number :");
    num = keyboard.nextInt();

    Random rand = new Random();
    rdm = rand.nextInt(11);

    int count;

    for (count = 1;num != rdm; count++)
    {
      if (num > rdm)
      System.out.println("too high, try again");
       if (num < rdm)
        System.out.println("too low, try again");
       System.out.print("input any number : ");
       num = keyboard.nextInt();
     }
     System.out.println("Correct guess and the number of guess is : " + count);
   }
  }