import java.util.*;
 public class AverageRainfall
 {
  public static void main(String[]args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("input number of years : ");
    int years = keyboard.nextInt();
    while (years < 1)
    {
     System.out.println("invalid number");
     System.out.print("input number of years : ");
     years = keyboard.nextInt();
    }
    final int MONTH = 12;
    int count;
    int sum = 0;
    int averageRain = 0;
    int countM = 0;
    int totalM=0;
    for (count = 1; count <= years; count++)
    {
     for (countM = 0; countM < MONTH; countM++)
     {
       System.out.print("input inches of rainfall for month " + (countM + 1) + ": ");
       int rainInches = keyboard.nextInt();
       while (rainInches < 0)
        {
          System.out.println("invalid number");
          System.out.print("input inches of rainfall for month " + (countM + 1) + ": ");
          rainInches = keyboard.nextInt();
        }
        sum += rainInches;
        totalM++;
       }

      }
      averageRain = sum / countM;
       System.out.println("The number of months is : " + totalM +
	                      "\nThe total inches of rainfall is : " + sum +
                          "\nThe average rainfall per month is " + averageRain);
    }
   }
