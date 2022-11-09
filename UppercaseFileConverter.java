import java.util.*;
import java.io.*;
 public class UppercaseFileConverter
 {
  public static void main(String[]args) throws IOException
  {

   Scanner keyboard = new Scanner(System.in);

   System.out.print("input name of file to be opened : ");
   String filename = keyboard.nextLine();

   File file = new File(filename + ".txt");
   Scanner inputFile = new Scanner(file);

   System.out.print("input name of file for writing : ");
   String writing = keyboard.nextLine();
   PrintWriter outputFile = new PrintWriter(writing + ".txt");

   while(inputFile.hasNext())
   {
    String output = inputFile.nextLine();
    outputFile.println(output.toUpperCase());
   }
   inputFile.close();
   outputFile.close();
  }
 }
