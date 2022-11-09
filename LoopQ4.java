import java.util.Scanner;
 public class LoopQ4
 {
  public static void main(String[]args)
  {
   int num;
   System.out.print("input any number : ");
   Scanner keyboard = new Scanner(System.in);
   num = keyboard.nextInt();

   int count;
   int sum = 0;

   for (count = 0; count < num; count++)
   {
    System.out.print("input number : ");
    int userNum = keyboard.nextInt();
    sum += userNum;
    System.out.println("the sum is : " + sum);
   }
  }
 }