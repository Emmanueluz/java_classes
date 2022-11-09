import java.util.Scanner;
 public class LargestAndSmallest
 {
  public static void main(String[]args)
  {
    int num;
    int largest = 0, smallest = 1000000;

    Scanner keyboard = new Scanner(System.in);
    System.out.print("input your desired number, and enter -99 to end : ");
    num = keyboard.nextInt();

    while (num != -99)
    {
	  if (num > largest)
	   largest = num;
	    if (num < smallest && num < largest)
	     smallest = num;
      System.out.print("input your desired number, and enter -99 to end : ");
      num = keyboard.nextInt();
    }
    System.out.println("the Largest number is " + largest + " and the Smallest number is " + smallest );
    }
   }
