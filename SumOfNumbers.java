import java.util.Scanner;
 public class SumOfNumbers
 {
  public static void main(String[]args)
  {
    int num;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("input any postive nonzero integer value : ");
    num = keyboard.nextInt();

    int count = 1;
    int sum = 0;
    while (count <= num)
    {
      sum += count;
      count++;
    }
    System.out.println(sum);
   }
  }