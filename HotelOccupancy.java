import java.util.*;
public class HotelOccupancy
{
 public static void main(String[]args)
 {
   Scanner keyboard = new Scanner(System.in);
   System.out.print("input number of floors : ");
   int floors = keyboard.nextInt();
   while (floors < 1)
   {
    System.out.println("invalid number");
    System.out.print("input number of floors : ");
    floors = keyboard.nextInt();
   }

   int count = 0;
   double roomSum = 0;
   double roomOccupied = 0;

   while (count < floors)
   {
    System.out.print("input number of rooms : ");
    int rooms = keyboard.nextInt();
     while (rooms < 10)
    {
     System.out.println("invalid number");
     System.out.print("input number of rooms : ");
     rooms = keyboard.nextInt();
    }
    roomSum += rooms;
    System.out.print("input number of rooms occupied : ");
    int roomsOcc = keyboard.nextInt();
    roomOccupied += roomsOcc;
    count++;
   }
   double roomVac = roomSum - roomOccupied;
   double roomOccup = roomOccupied / roomSum;
   System.out.println("The number of rooms the hotel has is : " + roomSum +
                      "\nThe number of room occupied is : " + roomOccupied +
                      "\nThe number of vacant room are : " + roomVac );
   System.out.printf ("The occupancy rate is : %.1f\n",roomOccup);
  }
 }

