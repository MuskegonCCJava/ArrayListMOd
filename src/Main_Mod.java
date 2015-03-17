//	Main_Mod.java by Kyle Wolff and Brandon VanderMey on 3/17/2015 

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Mod
{
	
   public static void main(String[] args)
   {
	   Scanner scanner = new Scanner(System.in);
	   System.out.print("Enter number of elements: ");
	   int elements = scanner.nextInt();
	   scanner.nextLine();	//	Gets rid of enter key.
	   
	   ArrayList <String> names = new ArrayList<String>(elements);  // <String> is type of object ArrayList can hold
	   
	   for (int counter = 0; counter < elements; counter++)
	   {
		   System.out.print("Enter name: ");
		   names.add(scanner.nextLine());
	   }
	   
	   display(names);
   }
   
   public static void display(ArrayList names)
   {
      for(int x = 0; x < names.size(); ++x)
         System.out.println("position " + x + " Name: " +
            names.get(x));
   }
}
