/*
----------------------------------------------------------------------------------------------------------------------------------------------------
JAVA - Getting Started and The Basics - TUTORIAL TWO
----------------------------------------------------------------------------------------------------------------------------------------------------
*/
/*
NB:	If you have not seen my previous java tutorial and you have no coding experience please go back to see the basic functions and methods you need
	for the rest of the tutorials.
	
TIPS:
-The most common types of arrays are strings and integers
-Arrays indexes always starts at zero. If the array is declared of size 12, the index will be 0 to 11.
-Single arrays are basically like a list.
	#This is the array used in the example below, the first row is to show you the index and the second row is the numbers inside that index:
		|0| |1| |2| |3| |4| |5| |6| |7| |8| |9|  |10| |11|
		|1| |2| |3| |4| |5| |6| |7| |8| |9| |10| |11| |12|
-Double arrays is like a matrix with rows and columns, this is how the double array in the example below:
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
	public static int[] singleArray = new int[12];					//Declare a single array of size 12, index 0 1 2 3 4 till 11
	public static int[][] doubleArray = new int[12][2]; 			//Declare an double array(matrix) with 12 rows and 2 columns
	
	public void StoreSingleArrayValues(){					//Method to store values into the single array
		for (int i = 0; i<singleArray.length; i++){					//singleArray.length is the length of the array singleArray (12)
			singleArray[i] = i+1;									//Store the index plus one into the array index
		}
	}
	
	public void printSingleArray(){							//Self explanetory
		System.out.println("This is the single array:");
		System.out.println("----------------------------------------------------"); //To make the array more presentable for my viewers
		for (int i = 0; i<singleArray.length; i++){
			System.out.print("| " + singleArray[i] + " ");			//To make the array more presentable for my viewers
		}
		System.out.println("|" + "\n" + "----------------------------------------------------"); //To make the array more presentable for my viewers
	}
	
	public void StoreDoubleArrayValues(){					//Method to store values 1 to 12 into the columns at index 0 and 1
		for (int i = 0; i<doubleArray.length; i++){					//The arrays length is 12, because it takes the highest length of columns or rows
			for (int j = 0; j<doubleArray[i].length; j++){			//doubleArray[i].length is the amount of columns in the double array (2)
				doubleArray[i][j] = i+1;							//This for loop iterates 2 times and the outer for loop iterates 12 times
			}
		}
		for (int i = 0; i<doubleArray.length; i++){					//doubleArray.length, amount of rows = 12
			for (int j = 0; j<doubleArray[i].length; j++){			//doubleArray[i].length, amount of columns = 2
				doubleArray[i][1] = (int)(Math.random()*100) + 1;	//Store random values from 1 and 100 into the second column at index 1
			}														//Use function Math.random(), start at 1 and finish at 1000
		}															//(int) makes it an integer value stored into the second column
	}
	
	public void printDoubleArray(){							//Print the double array
		System.out.println("This is the double/2D/Matrix array:");
		System.out.println("----------");
		for (int i = 0; i<doubleArray.length; i++){					//doubleArray.length - Amount of rows
			for (int j = 0; j<doubleArray[i].length; j++){			//doubleArray[i].length - Amount of columns
				System.out.print("| " + doubleArray[i][j] + " ");
			}
			System.out.println("|" + "\n" + "----------");			//Make each row get printed on a seperate line to make it more readable
		}
	}
	
	public static void main(String[] args){
		JavaCodeTwo Obj = new JavaCodeTwo();
		
		Obj.StoreSingleArrayValues();
		Obj.printSingleArray();
		Obj.StoreDoubleArrayValues();
		Obj.printDoubleArray();
	}
}