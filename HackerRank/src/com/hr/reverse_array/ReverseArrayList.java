package com.hr.reverse_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Result2{
	public static List<List<Integer>> reverseRows(List<List<Integer>> matrix, int row){
		int start = 0, end = matrix.size() -1;
		
		while(start < end) {
			int temp = matrix.get(row).get(start);
			matrix.get(row).set(start, matrix.get(row).get(end));
			matrix.get(row).set(end, temp);
			
			start++;
			end--;
		}
		
		
		return matrix;
	}
	
	public static List<List<Integer>> reversColumns(List<List<Integer>> matrix, int col){
		int start = 0, end = matrix.size() -1;
		
		while(start<end) {
			int t = matrix.get(start).get(col);
			matrix.get(start).set(col, matrix.get(end).get(col));
			matrix.get(end).set(col, t);
			
			start++; end--;
		}
		
		
		return matrix;
	}
	
	public static void show(List<List<Integer>> matrix) {
		for(List<Integer> row: matrix) {
			for(Integer e: row) {
				System.out.print(e + " ");
			}
			System.out.println();
		}
	}
}

public class ReverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> matrix = new ArrayList<>();
		int n = new Random().nextInt(6-2)+2;
		
		// Initialize matrix
		for(int l=0;l<n;l++) {
			matrix.add(new ArrayList<>());
			for(int c=0;c<n;c++) {
				matrix.get(l).add(new Random().nextInt(99)+1);
			}
		}
		
		Result2.show(matrix);
		
		System.out.println();
		matrix = Result2.reverseRows(matrix, 1);
		Result2.show(matrix);

		System.out.println();
		matrix = Result2.reversColumns(matrix, 2);
		Result2.show(matrix);
		
		
		
		
	}

}
