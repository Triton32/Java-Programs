/*
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
AUTHOR: TRITON -(STEFAN MUNNIK)
JAVA - Getting Started and The Basics - CODE ONE
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*/
/* TIPS: */
// "//" and "/* */" is used to comment, java will not read this as code.
// Multiplication Operator: *, Division: /, Plus: +, Minus: -, Power: **
// Use tab spaces to make your code more readable.
// { } Brackets are used in java to show where a method starts and where a method ends.
// At the end of every java instruction there needs to be a semi colon. This is java's way to recognize that its an instruction.
// The basic variables of java is of type integer, double, float and String.

public class JavaCodeOne{			                   	//This is how you start any java program. It is always the name of the java file.
    public int ifStatement(int var1, int var2){			//This is how a method is declared in java. var1 and var2 are the variables containing the numbers you inputted in the main method.
        String word = "ERROR";							//Store "ERROR" inside the String variable word
		int answer1 = 0;								//Initialize answer variable
		if (var1 > 0 && var2 > 0){                      //If var1 and var2 is bigger than 0. If the statement is true it moves to the line/function that follows.		
            answer1 = var1 + var2;                      //ADD (1+5) = 6 and store this value back into the variable answer.
        }else{                                          //If the statement is false it moves to the line/function(print) that follows.
			System.out.print(word);                     //Print the line "ERROR" inside the variable word to the CMD/terminal if smaller than 0.
        }
		return answer1;									//Return the value inside answer1
    }
	
	public int whileLoop(int var1, int var2){
		int counter = 0;								//Make a counter for the condition of staying in the while loop
		int answer2 = 0;
		while (counter<5){								//If the counter is less than 5 then continue looping until false
			answer2 = answer2 + var2;					//First loop: 0 + 5 = 1, Second loop: 5 + 5 = 10, Third loop: 10 + 5 = 15, Continue...25
			counter = counter + 1;						//If counter is equal to 5 it will break out of the loop
		}												//If false then break out of the loop
		return answer2;
	}													//var1 is not used in this method
	
	public int forLoop(int var1, int var2){
		int answer3 = 0;
		for (int i = 0; i < 5; i++){					//Declare the index as 0; if i is smaller than 5 continue the loop; i = i + 1(add 1 to index)
			answer3 = answer3 + var1;					//Same loop as the while loop, but uses variable 1 to add to 5
		}												//The for loop has an automatic counter
		return answer3;									//Return the value inside answer3
	}
	
//This function is going to be used to call and excecute different your functions/methods, print answeres and declare some variables.	
	public static void main(String[] args){
		JavaCodeOne Object = new JavaCodeOne(); 		//Make an variable to called Object to call and excecute different functions/methods. 
		
		System.out.println("Hello.");					//Prints a line called "Hello." on the terminal/command prompt.
		
		int number1 = 1;								//Store 1 into variable number1
		int number2 = 5;								//Store 5 into variable number2
		int falsenumber = -1;							//Input negative number to use in ifStatement
		
		//Call the method ifStatement and input an integer 5 into number2 declared at ifStatement.
		int finalAnswer1 = Object.ifStatement(number1, number2);
		//Print out the value of the answer.
		System.out.println("The value of " + number1 + " plus " + number2 + " is: " + finalAnswer1);
											//print nr1			//print nr2
											
		//Test negative number var2 in ifStatement									
		System.out.print("Check what happens if the if statement in method ifStatement is false: ");
		Object.ifStatement(number1, falsenumber);
		
		//Call the method whileLoop
		int finalAnswer3 = Object.whileLoop(number1, number2);
		//print answer2 used in whileLoop
		System.out.println("\nAfter excecuting method whileLoop the value of answer2 is: " + finalAnswer3);
		
		//Make an integer variable finalAnswer and store the return value of method forLoop into the variable
		int finalAnswer4 = Object.forLoop(number1, number2);
		//Print the variable finalAnswer
		System.out.println("After excecuting method forLoop the value of answer3 is: " + finalAnswer4);
	}
}