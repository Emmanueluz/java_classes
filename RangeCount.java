import java.util.Scanner;
 public class RangeCount
 {
  public static void main(String[]args)
  {
   
   int numScores;
    
   Scanner keyboard = new Scanner(System.in);
   
   System.out.print("input how many testscores you are computing - ");
   
   numScores = keyboard.nextInt();
   
   int rangeCount = 0;
   int count = 0;
   
   while(count < numScores)
   {
     System.out.print("input score - ");
     int score = keyboard.nextInt();
     if(score > 70 && score < 80)
           rangeCount++;
     count++;
   }
   System.out.println(rangeCount);
  }
 }