package com.hr.matrix_game;

import java.util.Random;

/**
 * 
 * @author Juandi
 * Rules of the game
 * 1. You can reverse any column or any row in the array, however many times
 * 2. Matrix must be a square
 * 3. Size of matirx must be even
 * 4. 
 * 
 * Objective
 * 	--Reverse the rows and colums until the sum of all elements in the upper left quadrant is maximal.
 */

class Result{
	
	public static void printMatrix(int[][] matrix) {
		for(int l=0;l<matrix.length;l++) {
			for(int c=0;c<matrix.length;c++) {
				System.out.print(matrix[l][c]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static int upperLeftSum(int[][] arr) {
		int sum = 0;
		
		//System.out.println("Upper left");
		// Find sume of upper left quadrant
		printMatrix(arr);
		for(int l =0;l<arr.length/2;l++) {
			for(int c= 0;c<arr.length/2;c++) {
				//System.out.print(arr[l][c] + " ");
				sum += arr[l][c];
			}
			//System.out.println();
		}
		System.out.println("Sum:"+sum);
		return sum;
	
	}
	
	public static int[][] reverseRow(int[][] arr, int row){
		System.out.println("Flipping row...");
		
		// We calculate the sum of the elements at each half of the row
        int firsthalf = 0, secondhalf = 0;
        for(int i=0;i<arr.length/2;i++) {
            firsthalf += arr[row][i];
            secondhalf += arr[row][arr.length - i -1];
        }
        System.out.println("First half: " + firsthalf + " Second half: " + secondhalf);

        // If the sum of the right half of the row is bigger, we flip the row
        if(firsthalf < secondhalf){
            int start = 0, end = arr.length -1;

            while(start < end) {
                int temp = arr[row][start];
                arr[row][start] = arr[row][end];
                arr[row][end] = temp;

                start++;
                end--;
            }
            System.out.println("Row: " + row + " has flipped");
        }


        return arr;
    }
	
	
	public static int[][] reverseColumn(int[][] arr, int col){
		System.out.println("Flipping column...");
		
        // We calculate the sum of the elements at each half of the column
        int firsthalf = 0, secondhalf = 0;
        for(int i=0;i<arr.length/2;i++) {
            firsthalf += arr[i][col];
            secondhalf += arr[arr.length - i - 1][col];
        }
        System.out.println("First half: " + firsthalf + " Second half: " + secondhalf);

        // If the sum of the right half of the row is bigger, we flip the column
        if(firsthalf < secondhalf){
            int start = 0, end = arr.length -1;

            while(start < end) {
                int temp = arr[start][col];
                arr[start][col] = arr[end][col];
                arr[end][col] = temp;

                start++;
                end--;
            }
            System.out.println("Col: "+ col +" has flipped");
        }


        return arr;
	}
	
	public static int[][] matrixGame(int[][] arr){
		int maxSum = upperLeftSum(arr);
		int[][] maxMatrix = new int[arr.length][arr.length];
		
		for(int i=0;i<arr.length;i++) {
			maxMatrix[i] = arr[i].clone();
		}

		
		// Reverse either row or col, dependding on the current iteration of the loop
		// If even rev row, else rev col
//		for(int l=0;l<arr.length*2;l++) {
//			
//			if(l % 2 == 0) {
//				arr = reverseRow(arr, l/2);
//			}
//			else {
//				arr = reverseColumn(arr, l/2);
//			}
//			
//			int sum = upperLeftSum(arr);
//			if(sum > maxSum) {
//				//System.out.println(sum + " is greater than " + maxSum + ". Therefore, the currently maximized array is");
//				maxSum = sum;
//				//maxMatrix = arr.clone();
//				for(int i=0;i<arr.length;i++) {
//					maxMatrix[i] = arr[i].clone();
//				}
//				//printMatrix(maxMatrix);
//			}
//		}
		boolean maximal = false;
		int l = 0;
		while(l<arr.length*2) {
			int firsthalf = 0, secondhalf = 0;

			
			if(l % 2 == 0){
				arr = reverseRow(arr, l/2);
			}
			else{
				arr = reverseColumn(arr, l/2);
			}
			
			int sum = upperLeftSum(arr);
			if(sum > maxSum) {
				//System.out.println(sum + " is greater than " + maxSum + ". Therefore, the currently maximized array is");
				maxSum = sum;
				//maxMatrix = arr.clone();
				for(int i=0;i<arr.length;i++) {
					maxMatrix[i] = arr[i].clone();
				}
				//printMatrix(maxMatrix);
				l=0;
			} else {
				l++;
			}
		}
		
		return maxMatrix;
	}
	
}

public class MatrixGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix;
		int size = 2*(new Random().nextInt(3-1)+1);
		
		matrix = new int[size][size];
		
		// Initialize matrix
		for(int l=0;l<size;l++) {
			for(int c=0;c<size;c++) {
				matrix[l][c]=new Random().nextInt(50);
			}
		}
		
		//Print original matrix
		//Result.printMatrix(matrix);

		matrix = Result.matrixGame(matrix);
		
		// Print maximalized array
		System.out.println("\nMaximalize array");
		for(int l=0;l<size;l++) {
			for(int c=0;c<size;c++) {
				System.out.print(matrix[l][c]+" ");
			}
			System.out.println();
		}
		System.out.println();
		//System.out.println("Sum: " + Result.upperLeftSum(matrix));
		
		
		
		
	}

}
