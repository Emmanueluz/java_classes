import java.util.Scanner;
import java.io.*;
 public class FileLetterCounter
 {
  public static void main(String[]args) throws IOException
  {

    Scanner keyboard = new Scanner(System.in);
    System.out.print("input the name of file : ");
    String filename = keyboard.nextLine();
    File file = new File(filename);
    if (!file.exists())
    {
	  System.out.print("invalid file name");
	  System.exit(0);
    }
    Scanner inputFile = new Scanner(file);
    System.out.print("input any letter : ");
    String dSamee = keyboard.nextLine();
    char dSame = dSamee.charAt(0);

    int sum = 0;
    while(inputFile.hasNext())
    {
	 String name = inputFile.nextLine();
	 int size = name.length();
       for (int count = 0;count < size;count++)
       {
         if (name.charAt(count) == dSame)
           sum++;
	 }
    }
    System.out.println("The letter appears " + sum + "times");
   }
  }

