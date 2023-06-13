package com.hr.reverse_array;

import java.util.Random;

public class ReverseArrayWithSwapping {

	// Method reverses columns in 2D array ny swapping front and back elements
	public static int[][] revColumns(int[][] a) {
		
		for(int c = 0;c<a.length;c++) {
			int start = 0, end = a.length -1;
			
			while(start < end) {
				int temp = a[start][c];
				a[start][c] = a[end][c];
				a[end][c] = temp;
				
				start++;
				end--;
			}
		}		
		
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int n = r.nextInt(6-2)+2;
		int[][] arr = new int[n][n];
		
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = r.nextInt(12);
//		}
		
//		for(int i =0;i<arr.length;i++) {
//			System.out.print(arr[i] + " ");
//		}
		
//		arr = revColumns(arr);
//		for(int i =0;i<arr.length;i++) {
//			System.out.print(arr[i] + " ");
//		}
		
		// Initialize matrix
		for(int l=0;l<n;l++) {
			for(int c=0;c<n;c++) {
				arr[l][c] = r.nextInt(12);
			}
		}

		// Display array
		for(int l=0;l<n;l++) {
			for(int c=0;c<n;c++) {
				System.out.print(arr[l][c] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// Reverse columns and print new array
		arr = revColumns(arr);
		for(int l=0;l<n;l++) {
			for(int c=0;c<n;c++) {
				System.out.print(arr[l][c] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
	}

}
