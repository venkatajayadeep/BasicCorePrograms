package BridgeLabz;
import java.utility.Utility;
public class LargestOfThree {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the first number to be checked ::");  
		int firstNumber = utility.getIntValue();							// input number 1
		System.out.println("Enter the second number to be checked ::"); 
		int secondNumber = utility.getIntValue();             				// input number 2
		System.out.println("Enter the third number to be checked ::");
		int thirdNumber = utility.getIntValue();							// input number 3

		utility.largestOfThreeNumbers(firstNumber,secondNumber,thirdNumber); //check largest of three
	}

}


