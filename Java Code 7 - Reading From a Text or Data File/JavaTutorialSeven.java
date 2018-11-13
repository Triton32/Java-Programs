/*
----------------------------------------------------------------------------------------------------------------------------------------------------
JAVA - Reading From a File - TUTORIAL SEVEN
----------------------------------------------------------------------------------------------------------------------------------------------------*/
/*
NB:	If you have not seen my previous java coding material and you have no coding experience please go back to see the basic functions and methods
	you need for the rest of the coding material.

TIPS:
-In this java program we will read different integers from a text file and read it into an array.
-We will use this array to do some basic calculations.
*/
import java.util.*;
import java.io.FileNotFoundException;
import java.io.File;

public class JavaTutorialSeven{
	public static String[] StringArray = new String[5];
	
	public void convertStringToInt(){
		
	}
	
	public void readData(){
		String fileName = "C:/Triton/Triton Coding/Java/Tutorial 7 - Reading From a Text or Data File/Data.txt";
		String currentLine;
		try{
			Scanner inputData = new Scanner(new File(fileName));
			while (inputData.hasNextLine()){
				currentLine = inputData.nextLine();
				StringArray[counter] = currentLine;
				//String[] tempArray = currentLine.split(" ");
			}
			inputData.close();
		}catch (FileNotFoundException e){
			System.out.println("File could not be found. The program will now exit.");
			System.exit(0);
		}
	}
	
	public static void main(String[] args){
		JavaTutorialSeven Obj = new JavaTutorialSeven();
		Obj.readData();
		for (int i = 0; i<StringArray.length; i++){
			System.out.println(StringArray[i]);
		}
	}
}