/*
----------------------------------------------------------------------------------------------------------------------------------------------------
AUTHOR: TRITON -(STEFAN MUNNIK)
JAVA - Lists and Matrices - CODE TWO
----------------------------------------------------------------------------------------------------------------------------------------------------
*/
/*
NB:	If you have not seen my previous java coding material and you have no coding experience please go back to see the basic functions and methods
	you need for the rest of the coding material.
	
TIPS:
-The most common types of arrays are strings and integers
-Arrays indexes always starts at zero. If the array is declared of size 12, the index will be 0 to 11.
-Single arrays are basically like a list.
	#This is the array used in the example below, the first row is to show you the index and the second row is the numbers inside that index:
		|0| |1| |2| |3| |4| |5| |6| |7| |8| |9|  |10| |11|
		|1| |2| |3| |4| |5| |6| |7| |8| |9| |10| |11| |12|
-Matrices has rows and columns, this is how the matrix look like in the example below: 2 columns and 12 rows
					COLUMNS
		|1|  |Random number from 1 and 100|
		|2|  |Random number from 1 and 100|
		|3|  |Random number from 1 and 100|
		|4|  |Random number from 1 and 100|
		|5|  |Random number from 1 and 100|
ROWS	|6|  |Random number from 1 and 100|
		|7|  |Random number from 1 and 100|
		|8|  |Random number from 1 and 100|
		|9|  |Random number from 1 and 100|
		|10| |Random number from 1 and 100|
		|11| |Random number from 1 and 100|
		|12| |Random number from 1 and 100|
*/

public class JavaCodeTwo{
	public int[] storeListValues(int[] list){					//Method to store values into the list
		for (int i = 0; i<list.length; i++){					//list.length is the length of the array list (12)
			list[i] = i+1;										//Store the index plus one into the array index
		}
		return list;
	}
	
	public void printList(int[] list){
		System.out.println("This is the single array:");
		//Neatness
		System.out.println("----------------------------------------------------");
		for (int i = 0; i<list.length; i++){
			System.out.print("| " + list[i] + " ");				//Print each integer index of list 0-11
		}
		//Neatness
		System.out.println("|" + "\n" + "----------------------------------------------------"); 
	}
	
	public int[][] storeMatrixValues(int[][] matrix){			//Method to store values 1 to 12 into the columns at index 0 and 1
		for (int i = 0; i<matrix.length; i++){					//The matrix length is 12, because it takes the highest length of columns or rows
			for (int j = 0; j<matrix[i].length; j++){			//matrix[i].length is 2, the amount of columns in the matrix
				matrix[i][j] = i+1;								//This for loop iterates 2 times and the outer for loop iterates 12 times
			}
		}
		for (int i = 0; i<matrix.length; i++){					//matrix.length, amount of rows = 12
			for (int j = 0; j<matrix[i].length; j++){			//matrix[i].length, amount of columns = 2
				matrix[i][1] = (int)(Math.random()*100) + 1;	//Store random values from 1 and 100 into the second column at index 1
																//Use built in function Math.random()
																//(int) makes it an integer value stored into the second column
			}											
		}
		return matrix;
	}
	
	public void printMatrix(int[][] matrix){					//Print the matrix
		System.out.println("This is the double/2D/Matrix array:");
		System.out.println("----------");
		for (int i = 0; i<matrix.length; i++){					//matrix.length - Amount of rows
			for (int j = 0; j<matrix[i].length; j++){			//matrix[i].length - Amount of columns
				System.out.print("| " + matrix[i][j] + " ");
			}
			System.out.println("|" + "\n" + "----------");		//Make each row get printed on a seperate line to make it more readable
		}
	}
	
	public static void main(String[] args){
		JavaCodeTwo Obj = new JavaCodeTwo();
		
		int[] list = new int[12];					//Declare a list of size 12, index 0 1 2 3 4 till 11
		int[][] matrix = new int[12][2]; 			//Declare an matrix with 12 rows and 2 columns
		
		list = Obj.storeListValues(list);
		Obj.printList(list);
		matrix = Obj.storeMatrixValues(matrix);
		Obj.printMatrix(matrix);
	}
}