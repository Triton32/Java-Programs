/*
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
AUTHOR: TRITON -(STEFAN MUNNIK)
JAVA - Find Maximum and Minimum Values in Matrices - CODE FIVE
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*/
/*
NB:	If you have not seen my previous java coding material and you have no coding experience please go back to see the basic functions and methods
	you need for the rest of the coding material.

TIPS:
-In this java program two 4(rows)x4(columns) matrices (Double Arrays) will be created and compared
-We will generate random numbers and refer to them as IQ's
-We will try and find the highest and lowest IQ in the two Matrices, searching through both of them
*/
public class MinAndMax{
	public int findMaximum(int max, int maxMatrixOne, int maxMatrixTwo, int[][] MatrixOne, int[][] MatrixTwo){//Method to find the maximum value in the two matrices
		for (int i = 0; i<MatrixOne.length; i++){							//Rows
			for (int j = 0; j<MatrixOne.length; j++){						//Columns
					//The maxMatrixOne variable is 0 when it is created
				if (MatrixOne[i][j] > maxMatrixOne){						//If the element in the MatrixOne is bigger than the maximum value
					maxMatrixOne = MatrixOne[i][j];							//Store the value which is bigger into the maxMatrixOne variable
				}
			}
		}
		
		for (int i = 0; i<MatrixTwo.length; i++){							//Rows
			for (int j = 0; j<MatrixTwo.length; j++){						//Columns
					//The maxMatrixTwo variable is 0 when it is created
				if (MatrixTwo[i][j] > maxMatrixTwo){						//If the element in the MatrixTwo is bigger than the maximum value
					maxMatrixTwo = MatrixTwo[i][j];							//Store the value which is bigger into the maxMatrixTwo variable
				}
			}
		}
		
		if (maxMatrixOne > maxMatrixTwo){									//If the maximum value in matrix one is bigger than matrix two's element
			max = maxMatrixOne;												//Store the max value of matrix one in the final variable max
		}else{																//If false
			max = maxMatrixTwo;												//Store the max value of matrix two in the final variable max
		}
		
		return max;															//Return the maximum value in the two matrices to be printed out
	}
	
	public int findMinimum(int upper, int min, int minMatrixOne, int minMatrixTwo, int[][] MatrixOne, int[][] MatrixTwo){//Method to find the minimum value in the two matrices
		minMatrixOne = upper;												/*The initial value when the minimum variables are created is 0.
																			  Therefore we have to store the upper limit inside the minimum values 
																			  because it has to compare which value is smaller.*/
		minMatrixTwo = upper;	
		for (int i = 0; i<MatrixOne.length; i++){							//Rows						
			for (int j = 0; j<MatrixOne.length; j++){						//Columns
				if (MatrixOne[i][j] < minMatrixOne){						//If the element inside MatrixOne is smaller than minMatrixOne(upper limit)
					minMatrixOne = MatrixOne[i][j];							//Store the element inside the variable minMatrixOne and continue looping
				}
			}
		}
		
		for (int i = 0; i<MatrixTwo.length; i++){							//Rows
			for (int j = 0; j<MatrixTwo.length; j++){						//Columns
				if (MatrixTwo[i][j] < minMatrixTwo){						//If the element inside MatrixTwo is smaller than minMatrixTwo(upper limit)
					minMatrixTwo = MatrixTwo[i][j];							//Store the element inside the variable minMatrixTwo and continue looping
				}
			}
		}
		
		if (minMatrixOne < minMatrixTwo){									//If the minimum element in matrix one is smaller than matrix two's element
			min = minMatrixOne;												//Store the matrix one element inside the final minimum variable min
		}else{																//If false
			min = minMatrixTwo;												//Store the matrix two element inside the final minimum variable min
		}
		
		return min;															//Return the minimum value of the two matrices to print
	}

	public int[][] createMatrixOne(int[][] MatrixOne, int low, int high){	//Method to create the two matrices
		for (int i = 0; i<MatrixOne.length; i++){							//Rows
			for (int j = 0; j<MatrixOne.length; j++){						//Columns
				MatrixOne[i][j] = (int)(low + Math.random()*(high-low+1));	//Generate a random number from 10 to 99 to store inside the matrix one indexes
			}
		}
		return MatrixOne;
	}
	
	public int[][] createMatrixTwo(int[][] MatrixTwo, int low, int high){	//Method to create the two matrices
		for (int i = 0; i<MatrixTwo.length; i++){							//Rows
			for (int j = 0; j<MatrixTwo.length; j++){						//Columns
				MatrixTwo[i][j] = (int)(low + Math.random()*(high-low+1));	//Generate a random number from 10 to 99 to store inside the matrix two indexes
			}
		}
		return MatrixTwo;
	}
	
	public void displayMatrix(int[][] Matrix){								//Method to display the matrix called
		System.out.println("----------------------");						//To make it more readable
		for (int i = 0; i<Matrix.length; i++){								//Rows
			for (int j = 0; j<Matrix.length; j++){							//Columns
				System.out.print("| " + Matrix[i][j] + " ");				//Print elements in matrix
			}
			System.out.println("|" + "\n" + "----------------------");		//To make it more readable
		}
	}
	
	public static void main(String[] args){
		MinAndMax Objectect = new MinAndMax();
		
		int[][] MatrixOne = new int[4][4];						//Create a 4x4 matrix variable for the first matrix called matrixOne
		int[][] MatrixTwo = new int[4][4];						//Create a 4x4 matrix variable for the second matrix called matrixTwo
		int lower = 40;											//Lower limit of the random values generated into the matrices
		int upper = 170;										//Upper limit of the random values generated into the matrices
		int maxMatrixOne = 0;									//Variable to find the maximum value in MatrixOne
		int maxMatrixTwo = 0;									//Variable to find the maximum value in MatrixTwo
		int minMatrixOne = 0;									//Variable to find the minimum value in MatrixOne
		int minMatrixTwo = 0;									//Variable to find the minimum value in MatrixTwo
		int max = 0;											/*Compare the two maximum values in matrix one and two and store 
																 the biggest into this variable*/
		int min = 0;											/*Compare the two minimum values in matrix one and two and store 
																the biggest into this variable*/
		MatrixOne = Objectect.createMatrixOne(MatrixOne, lower, upper);		//Call method to create the first matrix
		MatrixTwo = Objectect.createMatrixTwo(MatrixTwo, lower, upper);		//Call method to create the second matrix
		System.out.println("<-------- Matrix ONE IS -------->");
		Objectect.displayMatrix(MatrixOne);									//Display MatrixOne
		System.out.println("<-------- Matrix TWO IS -------->");
		Objectect.displayMatrix(MatrixTwo);									//Display MatrixTwo
		System.out.println("The lowest IQ is: " + Objectect.findMinimum(upper, min, minMatrixOne, minMatrixTwo, MatrixOne, MatrixTwo));//Print minimum value of two matrices
		System.out.println("The highest IQ is: " + Objectect.findMaximum(max, maxMatrixOne, maxMatrixTwo, MatrixOne, MatrixTwo));//Print maximum value of two matrices
	}
}