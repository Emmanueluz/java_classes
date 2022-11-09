import java.util.Scanner;
 public class Sentinel
 {
  public static void main(String[]args)
  {

    int number;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("input desired numbers you are looking to find the average for\n" +
                     "and input -11 to end program : ");
     number = keyboard.nextInt();

    int sum = 0;
    int count = 1;
    double average;

    while (number != -11)
    {
      sum += number;
      average = sum / count;
      System.out.println("your average is : " + average + "\n" +
                         "input numbers to continue else -11 to end - ");
      number = keyboard.nextInt();
      count++;
    }
    System.out.println("Thank you for using this program ^-^");
   }
  }