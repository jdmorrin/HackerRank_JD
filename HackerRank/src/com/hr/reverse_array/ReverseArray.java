package com.hr.reverse_array;

import java.util.Random;

class Result{
	public static int[] reverse(int[] arr) {
		int[] rev = new int[arr.length];
		
		for(int i =0; i<rev.length;i++) {
			rev[i] = arr[arr.length - i -1];
		}
		
		return rev;
		
	}
}

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int[] arr = new int[r.nextInt(10)];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = r.nextInt(12);
		}
		
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		arr = Result.reverse(arr);
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
