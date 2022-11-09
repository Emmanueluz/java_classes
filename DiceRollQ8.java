import java.util.Random;
public class DiceRollQ8
{
 public static void main(String[]args)
 {
   int rolls = 10000;
   int count;
   int sum = 0;

   for (count = 0; count < rolls; count++)
   {
	 Random rand = new Random();
	 int roll = rand.nextInt(10000)+1;
     if (roll == 3)
     {
      sum++;
     }
   }
   System.out.println("the number of times 3 appeared is : " +sum);
  }
 }

