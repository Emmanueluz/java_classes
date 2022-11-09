import java.util.*;
public class GuessGame
{
 public static void main(String[]args)
 {

  int num;
  int guess;
  int count = 0;
  Random rand = new Random();
  guess = rand.nextInt(100) + 1;

  do
  {
   Scanner keyboard = new Scanner(System.in);
   System.out.print("Guess any number : ");
   num = keyboard.nextInt();
   if (num > guess)
   System.out.println("your guess was too high.");
   if (num < guess)
   System.out.println("your guess was too low.");
   count++;
  }while (num != guess);
  System.out.println("The number of incorrect guesses : " + count);
 }
}
