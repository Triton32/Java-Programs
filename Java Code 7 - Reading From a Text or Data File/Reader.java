/*
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
AUTHOR: TRITON -(STEFAN MUNNIK)
JAVA - Reading from a file - CODE SEVEN
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*/
/*
NB:	If you have not seen my previous java coding material and you have no coding experience please go back to see the basic functions and methods
	you need for the rest of the coding material.

TIPS:
-First METHOD - readStringData: Read strings of String text file into a single sentance.
-Second METHOD - readIntegerData: Read integers of integer text file into a variable and sum it.
-Third METHOD - readLines: Read String text file lines into an array.
-Remember to close your reader after using it.
-Try/catch function helps to catch errors for example if there are no file with the name being called
*/
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class Reader{
	public String readStringData(String sentance){										//Read strings (words) from the string text file
		String fileName = "C:/Stefan/Triton Coding/Java/Java Code 7 - Reading From a Text or Data File/StringData.txt";//Store the text file into the variable called fileName
		try{																			//Statements that may cause an exception
			Scanner inputData = new Scanner(new File(fileName));						//Generate scanner to read inputs
			while (inputData.hasNext()){												//Reads if there is a next string and if it exists it continues the loop
				String word = inputData.next();											//Read and store next string inside word (seperated by spaces)
				sentance = sentance + word + " ";										//Plus each word to the sentance with a space in between
			}
			inputData.close();															//Close the scanner
		}catch (FileNotFoundException e){ 												//Print error if file is not found
			System.out.println("File could not be found. The program will now exit.");
		}
		return sentance;																//Return the sentance to print
	}
	
	public int readIntegerData(int sum){												//Read integers from the integer text file 
		String fileName = "C:/Stefan/Triton Coding/Java/Java Code 7 - Reading From a Text or Data File/IntegerData.txt";//Store the text file into variable called fileName
		try{																			//Statements that may cause an exception
			Scanner inputData = new Scanner(new File(fileName));
			while (inputData.hasNext()){
				int number = inputData.nextInt();										//Read and store next integer inside number variable (seperated by spaces)
				System.out.print(sum +  " + " + number + " = ");						//Print total sum and integer that is going to be added to the total
				sum = sum + number;														//Add integer to total sum						
				System.out.print(sum + "\n");											//Print the total sum after adding
			}
			inputData.close();
		}catch (FileNotFoundException e){
			System.out.println("File could not be found. The program will now exit.");
		}
		return sum;
	}
	
	public String[] readLines(String[] lines){
		String fileName = "C:/Stefan/Triton Coding/Java/Java Code 7 - Reading From a Text or Data File/StringData.txt";
		try{
			Scanner inputData = new Scanner(new File(fileName));
			for (int i = 0; i < 4; i++){												//Each index represents a line of the file. 0-3 is line 1-4.
				lines[i] = inputData.nextLine();										//Read each line of the text file into an array of size 4
			}
			inputData.close();
			return lines;
		}catch (FileNotFoundException e){
			System.out.println("File could not be found. The program will now exit.");
		}
		return lines;
	}
	
	public static void main(String[] args){
		Reader Object = new Reader();
		
		System.out.println("<--------------------- Read STRING File --------------------->");
		String sentance = "";
		sentance = Object.readStringData(sentance);
		System.out.println(sentance + "\n");											//Print out the entire sentance after adding all strings
		
		System.out.println("<--------------------- Read INTEGER File --------------------->");
		int sum = 0;
		int totalSum = Object.readIntegerData(sum);
		System.out.println("Total Sum: " + totalSum + "\n");							//Print the final sum after adding all integers
		
		System.out.println("<--------------------- String file lines into array --------------------->");
		String[] lines = new String[4];
		lines = Object.readLines(lines);
		for (int i = 0; i < lines.length; i++){
			System.out.println("Line " + (i + 1) + ": " + lines[i]);					//Print out each line
		}
	}
}