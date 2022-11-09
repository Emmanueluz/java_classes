import java.util.Scanner;
 public class NumbersValidation
 {
  public static void main(String[]args)
  {
    int number;
    
    Scanner keyboard = new Scanner(System.in);
    
    do
     { 
      System.out.print("input desired number : ");
      number = keyboard.nextInt();
     }
     while (number < 10 || number > 24);
     System.out.println("Good Job");
   }
  }
      