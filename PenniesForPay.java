import java.util.Scanner;
 public class PenniesForPay
 {
  public static void main(String[]args)
  {
   int days;

   Scanner keyboard = new Scanner(System.in);

   System.out.print("input number of days worked : ");

   days = keyboard.nextInt();

   while (days < 1)
   {
    System.out.println("input number of days greater than 1");
    System.out.print("input number of days worked : ");
    days = keyboard.nextInt();
   }
   System.out.println("days\t\t\tsalary\t\t\tsum");
   System.out.println("--------------------------------------------------------");
   double prod =0.01, sum = 0.01;
   for (int count = 1; count <= days; count++)
   {
	System.out.printf("%d\t\t\t$%.2f\t\t\t%.2f\n",count, prod,sum);
    prod = prod * 2 ;
    sum += prod;
   }
   System.out.printf("the total sum is : $%.2f\n", sum);
  }
 }

