/*
----------------------------------------------------------------------------------------------------------------------------------------------------
AUTHOR: TRITON -(STEFAN MUNNIK)
JAVA - Arrays and Scanning - CODE Four
----------------------------------------------------------------------------------------------------------------------------------------------------*/
/*
NB:	If you have not seen my previous java coding material and you have no coding experience please go back to see the basic functions and methods
	you need for the rest of the coding material.

TIPS:
-In this game there is 3 different levels. If you guess 8 to 10 right you move on to the next level otherwise you get moved down a level or if you
 lose on level 1 you loose the game. The first level asks the user the multiplication of two random numbers between 1-5, second level 6-10 and third
 level 11-15. GOOD LUCK!
*/
import java.util.Scanner;

public class MultiplicationGame{
	public int CheckUserInput(int low, int high){//Variable low and high is the lower and highest number of the range of random numbers
							//1,6,11	//5,10,15
		int correct = 0;															//Variable containing how much the user guessed right																//Correct numbers be equal to 0 after each level to start over															
		for (int i = 0; i<10; i++){													//After 10 questions break out the for loop
			int number1 = (int)(low + Math.random()*(high-low+1));					//Generate 1st random number from low-high range ex. 1-5(1st level)
			int number2 = (int)(low + Math.random()*(high-low+1));					//Generate 2st random number from low-high range ex. 1-5(1st level)
			int answer = number1*number2;											//Anwnser of the multiplication of the two random numbers
			
			Scanner read = new Scanner(System.in);									//Scanner read to read the users input
			System.out.print("What is " + number1 + " times " + number2 + ": ");	//Ask user input
			int userInput = read.nextInt();											//Get user input
			
			if (userInput == answer){												//Print correct if user input is equal to the answer
				System.out.println("That is correct!\n");
				correct++;															//Add 1 to correct if answered correct
			}else{
				System.out.println("Wrong!\n");										//Print wrong if answered wrong
			}
		}
		return correct;																//Return value guessed correctely
	}
	
	public int Levels(int level){													/*This method calls method CheckUserInput 
																					and checks the users correct guesses*/
		//Will always be true until it breaks out of the loop
		while (true){																//Continue looping until it breaks out (loose or win)
			int correct = 0;
			if (level == 1){														/*If the level equals 1 set the highest random multiplication
																					number to 5 and lowest to 1*/
				int low = 1;														
				int high = 5;
				correct = CheckUserInput(low, high);								//Call the function CheckUserInput and use the low and high variables
				if (correct >= 8 && correct <= 10){									//If the amount guessed correct is between 8 and 10
					System.out.println("Congradulations, you can move on to level 2!");//Print you can move on to next level
					level = 2;														//Set the level to 2 (next level)
					continue;														//Continue to the top of the while loop and check which level again
				}else{																//Do if the if statement is false
					System.out.println("You FAILED, the game will now exit!");
					break;															//Break out of the while loop and print you failed
				}
			}
			if (level == 2){														/*If the level equals 2 set the highest random multiplication
																					number to 6 and lowest to 10*/
				int low = 6;
				int high = 10;														
				correct = CheckUserInput(low, high);
				if (correct >= 8 && correct <= 10){									//Move on to level 3 if the amount guessed correct is between 8 and 10
					System.out.println("Congradulations, you can move on to level 3!");
					level = 3;
					continue;
				}else{
					System.out.println("You FAILED level 2, moving down a level.");	//Move down a level and set level equal to 1
					level = 1;															
					continue;														//Continue looping at the top
				}
			}
			if (level == 3){														/*If the level equals 3 set the highest random multiplication
																					number to 11 and lowest to 15*/
				int low = 11;
				int high = 15;
				correct = CheckUserInput(low, high);
				if (correct >= 8 && correct <= 10){									//If the amount guessed correct is between 8 and 10, print you have won
					System.out.println("CONGRADULATIONS!!! YOU HAVE WON THE GAME!!!");
					break;															//Break out of the while loop if the game is won
				}else{
					System.out.println("You FAILED level 2, moving down a level.");	//Move down a level if correct is not between 8 and 10
					level = 2;														//Set level equal to 2 and continue the loop
					continue;
				}
			}
		}
		return level;
	}
	
	public static void main(String[] args){
		MultiplicationGame Object = new MultiplicationGame();
		int level = 1;																//Declare the starting level of the user which is 1
		Object.Levels(level);															//Call method Levels()
	}
}