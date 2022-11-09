public class Clock
{
 public static void main(String[]args)
 {

  int hours;
  int seconds;
  int minutes;

  for (hours = 1; hours <= 24; hours++)
  {
   for (minutes = 0; minutes <= 59; minutes++)
   {
     for (seconds = 0; seconds <= 59; seconds++)
     {
      System.out.printf("%01d:%01d:%01d\r",hours,seconds,minutes);
     }
    }
   }

 }
}