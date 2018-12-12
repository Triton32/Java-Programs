/*
----------------------------------------------------------------------------------------------------------------------------------------------------
AUTHOR: TRITON -(STEFAN MUNNIK)
JAVA - Arrays and Scanning - CODE THREE
----------------------------------------------------------------------------------------------------------------------------------------------------
/*
NB:	If you have not seen my previous java coding material and you have no coding experience please go back to see the basic functions and methods
	you need for the rest of the coding material.

TIPS:
-Arrays are similar to lists.
-Lists indexes start at 0. If your list is size 12 it starts with 0 up until 11.
-The scanner function are used to recieve the input from a user.
-The following program is for you to guess te answer of the multiplication table of 5. If the answer is wrong it prints false and if it is correct,
 it prints true. The program also prints out the amount of answeres guessed correct. If you don't get 12, there is no hope (Just Joking).
*/

import java.util.Scanner;									//Import the function Scanner to read the users input

public class ArraysAndScanning{
	public int[] storeOneToTwelve(int[] tempArray){			//Method to Store 1 to 12 into the array oneToTwelve
		int[] oneToTwelve = new int[12];					//Declare variable to store 1 to 12
		for (int i = 0; i<tempArray.length; i++){			//tempArray.length is the length of the array, which is 12
			oneToTwelve[i] = i + 1;							//Store 1 to 12 into the array oneToTwelve. Starts at oneToTwelve[0] till oneToTwelve[11]
		}
		return oneToTwelve;									//Return array
	}
	
	public int[] correctAnswer(int[] oneToTwelve){			//Method to store the correct answer of the multiples of 5
		int[] answer = new int[12];
		for (int i = 0; i<oneToTwelve.length; i++){
			answer[i] = oneToTwelve[i]*5;					//First iteration is 5*1, because we stored 1 to 12 into array OneToTwelve
		}
		return answer;
	}
	
	public int testIfCorrect(int[] answer, int[] oneToTwelve){		//Test if the answer (guess) inputted from user is correct
		Scanner input = new Scanner(System.in);						//Make a scanner called input to scan the users input
		int userAnswer;												//Variable to store the users answer
		int countCorrect = 0;										//Declare an int variable counter to count the correct answeres
		for (int i = 0; i<oneToTwelve.length; i++){					//Length 12
			System.out.print("What is " + oneToTwelve[i] + " times " + "5: ");//Print out the question, first iteration "1*5", second "2*5" etc.
			userAnswer = input.nextInt();							//Store the users integer input inside the variable 
			//Throws an error when the user does not input an integer
			//nextLine() - For strings, nextDouble() - Doubles, nextFloat() - Floats
			if (userAnswer == answer[i]){							//If the users answer is equal to the first iteration of answer (5)
				System.out.println("That answer is correct.");		//Print answer is correct
				System.out.println("--------------------------------------------------------------------------");//For neatness
				countCorrect = countCorrect + 1;					//Add one to the counter if the answer is correct
			}else{
				System.out.println("That answer is incorrect.");	//Print incorrect if the answer is not equal to the first iteration of answer
				System.out.println("--------------------------------------------------------------------------");
			}
		}
		return countCorrect;										//Return the amount of correct answeres of the user
	}
	
	public static void main(String[] args){
		ArraysAndScanning Object = new ArraysAndScanning();
		
		Scanner Dummy = new Scanner(System.in);						//This Dummy scanner is going to scan the word/string you input, do not input an integer
		System.out.println("Enter your favourite word: ");
		String YourWord = Dummy.nextLine();							//Input the string/word into the string variable YourWord
		System.out.println("Your word is: " + YourWord + "\n");		//Print it out
		
		int[] tempArray = new int[12];								//Declare an array(list) to store 1 to 12 inside it
		int[] oneToTwelve = Object.storeOneToTwelve(tempArray);		//Store 1-12 into variable OneToTwelve
		
		int[] answer = Object.correctAnswer(oneToTwelve);				//Store the correct answeres into answer
		
		int countCorrect = Object.testIfCorrect(answer, oneToTwelve);	//Get the amount of correct answeres
		System.out.println("You had " + countCorrect + " correct answeres.");//Print the amount of answered guessed correct
	}
}