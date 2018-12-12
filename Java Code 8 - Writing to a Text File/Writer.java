/*
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
AUTHOR: TRITON -(STEFAN MUNNIK)
JAVA - Writing to a file - CODE EIGHT
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*/
/*
NB:	If you have not seen my previous java coding material and you have no coding experience please go back to see the basic functions and methods
	you need for the rest of the coding material.
	
TIPS:
-The following program writes the multiplication table of the value in variable tableOf to a text file called integers.

-When writing integers as a string to a file and reading it in again as an integer, the number will be integer.
-To convert an integer toString String you can use the function Integer.toString(variable)
-To convert an String to integer you can use the function String.valueOf(variable)

-BufferedWriter has an option to create a new line, while FileWriter does not.
-Remember to close your writer.
-You can view your file created in the directory saved by the FileWriter
*/
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Writer{
	public void writeToFile(int tableOf){
		try{ 		//FileWriter used to read in the file and BufferedWriter used to create new lines
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Stefan/Triton Coding/Java/Java Code 8 - Writing to a Text File/integers.txt"));	
			for (int i = 0; i < 12; i++){	//Create 12 new lines
				bw.write((i+1) + " times " + tableOf + " = " + (i+1)*tableOf);//Write each line and the row of the multiplication to the file integers.txt
				bw.newLine(); 				//Create new line
			}
			bw.close();
        }catch(Exception e){				//Catch any error that may occur
			System.out.println(e);
		}        
	}
	
	public static void main(String[] args){
		Writer Object = new Writer();
		int tableOf = 6;					//Value used to create a multiplication table
		Object.writeToFile(tableOf);
	}
}