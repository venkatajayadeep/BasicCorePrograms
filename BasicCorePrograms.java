package BridgeLabz;
import java.util.Scanner;
import java.utility.Utility;
public class BasicCorePrograms {
	public static void main (String[] args) {
		int x,y;
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the value of X and Y");  
		 x = sc.nextInt();  
	     y = sc.nextInt(); 
	     int quotient = x/y;
	     int reminder = x%y;
	     System.out.println("quotient is :" +quotient ); 
	     System.out.println("reminder is :" +reminder );
	}

}



