/*
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
AUTHOR: TRITON -(STEFAN MUNNIK)
JAVA - Getting Started and The Basics - TUTORIAL ONE
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*/
/* TIPS: */
// "//" and "/* */" is used to comment, java will not read this as code.
// Multiplication Operator: *, Division: /, Plus: +, Minus: -, Power: **
// Use tab spaces to make your code more readable.
// { } Brackets are used in java to show where a method starts and where a method ends.
// At the end of every java instruction there needs to be a semi colon. This is java's way to recognize that its an instruction.
// The basic variables of java is of type integer, double, float and String.

public class JavaBasicsTutorial{
    public int ifStatement(int var1, int var2){
        String word = "ERROR";
		int answer1 = 0;
		if (var1 > 0 && var2 > 0){		
            answer1 = var1 + var2;
        }else{
			System.out.print(word);
        }
		return answer1;
    }
	
	public int whileLoop(int var1, int var2){
		int counter = 0;
		int answer2 = 0;
		while (counter<5){
			answer2 = answer2 + var2;
			counter = counter + 1;
		}
		return answer2;
	}
	
	public int forLoop(int var1, int var2){
		int answer3 = 0;
		for (int i = 0; i < 5; i++){
			answer3 = answer3 + var1;
		}
		return answer3;
	}
	
	public static void main(String[] args){
		JavaBasicsTutorial Object = new JavaBasicsTutorial();
		
		System.out.println("Hello.");
		
		int number1 = 1;
		int number2 = 5;
		int falsenumber = -1;
		
		int finalAnswer1 = Object.ifStatement(number1, number2);
		System.out.println("The value of " + number1 + " plus " + number2 + " is: " + finalAnswer1);
																			
		System.out.print("Check what happens if the if statement in method ifStatement is false: ");
		Object.ifStatement(number1, falsenumber);
		
		int finalAnswer3 = Object.whileLoop(number1, number2);
		System.out.println("\nAfter excecuting method whileLoop the value of answer2 is: " + finalAnswer3);
		
		int finalAnswer4 = Object.forLoop(number1, number2);
		System.out.println("After excecuting method forLoop the value of answer3 is: " + finalAnswer4);
	}
}