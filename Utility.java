package java.utility;
import java.util.Scanner;

public class Utility {
	Scanner scanner;
	
 public Utility() {
	 scanner = new Scanner(System.in);
 	}
 
 public int getIntValue() {
	 return scanner.nextInt();
 	}
 
 public char getCharValue() {
	 return scanner.next().charAt(0); 	
 	}
 
   // FlipCoin
 public void flipCoin(int numberOfFlip) {
	 double heads =0,tails = 0;
		for(int i = 0;i < numberOfFlip; i++) {
		double side = Math.random();	
		if(side>0.5) 
			heads++;
		else 
			tails++;
		}
		System.out.println("Number of head occurance ::" + heads);
		System.out.println("Number of tail occurance ::" + (numberOfFlip-heads));
		double headPercent = ((heads * 100)/numberOfFlip);
		double tailPercent = ((tails * 100)/numberOfFlip);
		System.out.println("Heads Percentage ::" + headPercent + "%");
		System.out.println("Tails Percentage ::" + tailPercent + "%");
		}

//LeapYear 
public void getLeapYearStatus(int YearToCheck) {
	 boolean leapValue = false;
	    if (YearToCheck % 4 == 0) {  			// if the year is divided by 4
	      if (YearToCheck % 100 == 0) {		// if the year is century for leapyear must be divisible by 400
	        if (YearToCheck % 400 == 0)		 // if year is divided by 400
	          leapValue = true;
	        else
	          leapValue = false;
	      }
	      else
	        leapValue = true;						 // if the year is not century
	    }	    
	    else
	      leapValue = false;

	    if (leapValue)
	      System.out.println(YearToCheck + " is a leap year.");
	    else
	      System.out.println(YearToCheck + " is not a leap year.");
	  }

// Power Of Two
public void getPowerOfTwo(int powerOfTwo) {
	 if( powerOfTwo <= 0 || powerOfTwo <31){
	   	System.out.println("Power of 2's: ");
	        for(int i=0; i<=powerOfTwo; i++){
	        	int powerOfValue=((int)Math.pow(2,i));
	        	System.out.println("The value of 2^" + i + " is: "+ powerOfValue);
	        	}
	    	}
    else
   	System.out.println("Value overflows int value, try again!");
}

// Largest Of Three
public void largestOfThreeNumbers(int firstNumber,int secondNumber,int thirdNumber) {
	
 	if((firstNumber > secondNumber) && (firstNumber > thirdNumber))
		System.out.println(firstNumber + ":: First Number is the largest");
	else if((secondNumber > firstNumber) && (secondNumber > thirdNumber))
		System.out.println(secondNumber + ":: Second Number is the largest");
	else
		System.out.println(thirdNumber + ":: Third Number is the largest");
}
}
 	

