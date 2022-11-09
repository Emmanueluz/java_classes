import java.util.Scanner;
 public class LetterCounter
 {
  public static void main(String[]args)
  {

    String letter;

    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter any word : ");
    letter = keyboard.nextLine();
    int stringSize = letter.length();

    String input;
    char same;
    System.out.print("enter a single letter : ");
    input = keyboard.nextLine();
    same = input.charAt(0);

    int count = 0, sum = 0;
    while (count < stringSize)
    {
	 if(letter.charAt(count) == same)
	  sum++;
	 count++;
    }
    System.out.println("the letter you typed appeared :" + sum +" time(s)");
   }
  }
