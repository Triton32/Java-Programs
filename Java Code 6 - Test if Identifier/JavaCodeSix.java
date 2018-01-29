/*
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
JAVA - Reading From a File - TUTORIAL SIX
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*/
/*
NB:	If you have not seen my previous java tutorials and you have no coding experience please go back to see the basic functions and methods you need
	for the rest of the tutorials.

TIPS:
-In this tutorial we will test if a string input is a java identifier.
-A string is a java identifier if there are only underscores, alphabet characters, dollars and numbers.
-A java identifier may not begin with a number.
-We are going to ask the user to input a string and test if it is or is not a java identifier.
*/
import java.util.Scanner;

public class JavaCodeSix{										
	public boolean testIfUnderscore(char character){					//Test if the character from the testIfJavaIdentifier method is a underscore		
		if (character == '_'){											//If the character is an underscore
			return true;												//If statement is true
		}else{
			return false;												//If statement is false
		}
	}
	
	public boolean testIfNumber(char character){						//Test if the character from the testIfJavaIdentifier method is a digit
		if (character >= '0' && character <= '9'){						//If the number is 0,1,2,3,4,5,6,7,8 or 9
			return true;
		}else{
			return false;
		}
	}
	
	public boolean testIfLetter(char character){						//Test if character is part of the alphabet
		char newCharacter = Character.toUpperCase(character);			//Change the character to Upper Case for the following if statement
		if (newCharacter >= 'A' && newCharacter <= 'Z'){				//If the character is between the A and Z. If it is an alphabet character
			return true;												//If statement is true
		}else{
			return false;												//If statement is false
		}
	}
	
	public boolean testIfDollar(char character){						//Check if character is a dollar sign "$"
		if (character == '$'){											//If character is a dollar sign
			return true;
		}else{
			return false;
		}
	}
	
	public boolean testIfJavaIdentifier(String userInput){				//Test if the string inputted by the user is a Java Identifier
		boolean temp = false;											//Make a temporary boolean variable to store true or false in
		char firstCharacter = userInput.charAt(0);						//Store the first character of the userInput into a character variable called firstCharacter
		if (testIfUnderscore(firstCharacter) || testIfLetter(firstCharacter) || testIfDollar(firstCharacter)){//If first character is a underscore, letter or dollar sign
			temp = true;												//Store true into temp (if the user inputs a single character then the method returns true)						
			while (userInput.length()>1){								//Continue while loop until the length of the string is 1							
				userInput = userInput.substring(1);						//Remove the first character of the userInput and store the remaining string inside userInput
				char character = userInput.charAt(0);					//Store the first character inside char variable character
				if ((testIfUnderscore(character)) || (testIfLetter(character)) || (testIfNumber(character)) || testIfDollar(character)){//If underscore, letter, number or dollar
					temp = true;										//Store true into temp if the above if statement is true
				}else{
					temp = false;										//Store false into temp if the above if statement is false
					break;												//Break out of the while loop if the character is not equal to a underscore, letter, dollar or digit
				}
			}
		}
		return temp;													//Return the temp boolean variable (true or false Java Identifier)
	}
	
	public static void main(String[] args){
		JavaCodeSix Obj = new JavaCodeSix();
		
		Scanner readInput = new Scanner(System.in);
		
		System.out.print("Enter a String to test if it is a valid Java Identifier: ");
		String userInput = readInput.next();							//Store the String that the user inputted into userInput
		
		if (Obj.testIfJavaIdentifier(userInput)){						//Can be true or false, this is the value of the return variable temp in method testIfJavaIdentifier
			System.out.println("The String Input is a Java Identifier.");//If the method testIfJavaIdentifier is true
		}else{
			System.out.println("The String Input is NOT a Java Identifier.");	//If the method testIfJavaIdentifier is false		
		}
	}
}