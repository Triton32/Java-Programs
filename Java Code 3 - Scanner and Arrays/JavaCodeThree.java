/*
----------------------------------------------------------------------------------------------------------------------------------------------------
JAVA - Arrays and Scanning - TUTORIAL THREE
----------------------------------------------------------------------------------------------------------------------------------------------------*/
/*
NB:	If you have not seen my previous java tutorials and you have no coding experience please go back to see the basic functions and methods you need
	for the rest of the tutorials.

TIPS:
-Arrays are similar to lists.
-Arrays indexes start at 0. If your array is size 12 it starts with 0 up until 11.
-The scanner function are used to recieve the input from a user.
-The following program is for you to guess te answer of the multiplication table of 5. If the answer is wrong it prints false and if it is correct,
 it prints true. The program also prints out the amount of answeres guessed correct. If you don't get 12 don't be embarrest(sarcasm).
*/

import java.util.Scanner;											//Import the function Scanner to read the users input

public class JavaCodeThree{
	public static int[] OneToTwelve = new int[12];					//Declare an array(list) to store 1 to 12 inside it
	public static int[] theRealAnswer = new int[12];				//Declare an array to store the multiplication by 5 table int it
	public static int counter;										//Declare an int variable counter to count the correct answeres
	
	public void makeMultiplicationArray(){							//Method to make the create the correct answer
		for (int i = 0; i<OneToTwelve.length; i++){					//OneToTwelve.length is the length of the array (12)
			OneToTwelve[i] = i + 1;									//Store 1 to twelve into the array OneToTwelve. Starts at OneToTwelve[0] till OneToTwelve[11]
		}
		for (int i = 0; i<OneToTwelve.length; i++){
			theRealAnswer[i] = 5*OneToTwelve[i];					//Store the answeres of the array into theRealAnswer, first theRealAnswer[0] and continues...
		}															//First iteration is 5*1, because we stored 1 to 12 into array OneToTwelve
	}
	
	public void testIfCorrect(){									//Test if the answer (guess) inputted from user is correct
		Scanner input = new Scanner(System.in);						//Make a scanner called input to scan the users input
		int userAnswer;												//Variable to store the users answer
		for (int i = 0; i<OneToTwelve.length; i++){					//Length 12
			System.out.print("What is " + OneToTwelve[i] + " times " + "5: ");//Print out the question, first iteration "1*5", second "2*5" etc.
			userAnswer = input.nextInt();							//Store the users integer input inside the variable 
			//Throws an error when the user does not input an integer
			//nextLine() - For strings, nextDouble() - Doubles, nextFloat() - Floats
			if (userAnswer == theRealAnswer[i]){					//If the answer is equal to the first iteration of theRealAnswer (5)
				System.out.println("That answer is correct.");		//Print answer is correct
				System.out.println("--------------------------------------------------------------------------");//For neatness (very good English)
				counter = counter + 1;								//Add one to the counter if the answer is correct
			}else{
				System.out.println("That answer is incorrect.");	//Print incorrect if the answer is not equal to the first iteration of theRealAnswer
				System.out.println("--------------------------------------------------------------------------");
			}
		}
	}
	
	public static void main(String[] args){
		JavaCodeThree Obj = new JavaCodeThree();
		
		Scanner Dummy = new Scanner(System.in);						//This Dummy scanner is going to scan the word/string you input, do not input an integer
		System.out.println("Enter your favourite word: ");
		String YourWord = Dummy.nextLine();							//Input the string/word into the string variable YourWord
		System.out.println("Your word is: " + YourWord + "\n");		//Print it out
		
		Obj.makeMultiplicationArray();
		Obj.testIfCorrect();
		System.out.println("You had " + counter + " correct answeres.");//Print the amount of answered guessed correct
	}
}