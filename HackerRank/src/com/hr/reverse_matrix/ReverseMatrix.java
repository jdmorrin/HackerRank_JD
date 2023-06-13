package com.hr.reverse_matrix;

import java.util.Random;

class Result{
	
	public static int[] reverseArr(int[] arr) {
		int[] rev = new int[arr.length];
		
		for(int i =0;i<rev.length;i++) {
			rev[i] = arr[arr.length -i - 1];
		}
		
		return rev;
	}
	
	public static int[][] reverseRows(int [][] matrix){
		int [][] rev = new int[matrix.length][matrix.length];
		
		for(int l=0;l<rev.length;l++) {
			rev[l] = reverseArr(matrix[l]);
		}
		
		return rev;
	}
	
	public static int[][] reverseCols(int[][] arr) {
		int[][] rev = new int[arr.length][arr.length];
		int[] rcol = new int[arr.length];
		
		for(int i=0;i<rev.length;i++) {
			for(int c=0;c<rev.length;c++) {
				rcol[c] = arr[c][i];
			}
			rcol = reverseArr(rcol);
			
			for(int c = 0;c<rev.length;c++) {
				rev[c][i] = rcol[c];
			}
		}
		
		
		return rev;
	}
}

public class ReverseMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int n = 2*(r.nextInt(3-1)+1); // 2-6
		int [][] matrix = new int[n][n];
		
		System.out.println(n);
		
		for(int l = 0;l<n;l++) {
			for(int c = 0;c<n;c++) {
				matrix[l][c] = r.nextInt(10); 
			}
		}
		
		for(int l = 0;l<n;l++) {
			for(int c = 0;c<n;c++) {
				System.out.print(matrix[l][c]+" "); 
			}
			System.out.println();
		}

		int [][]rev = Result.reverseRows(matrix);
		System.out.println("\nReversedRows");
		for(int l = 0;l<n;l++) {
			for(int c = 0;c<n;c++) {
				System.out.print(rev[l][c]+" "); 
			}
			System.out.println();
		}
		
		rev = Result.reverseCols(matrix);
		System.out.println("\nReversed Columns");
		for(int l = 0;l<n;l++) {
			for(int c = 0;c<n;c++) {
				System.out.print(rev[l][c]+" "); 
			}
			System.out.println();
		}
		
		
		
	}

}
