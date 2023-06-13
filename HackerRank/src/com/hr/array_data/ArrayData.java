package com.hr.array_data;

import java.util.Random;

public class ArrayData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x;
		int[] y;
		int[] z;
		int n = new Random().nextInt(10);
		
		x = new int[n];
		for(int i =0;i<n;i++) {
			x[i] = new Random().nextInt(11);
		}
		
		y = x;
		z = new int[x.length];
		x[new Random().nextInt(9-2) + 2] = 999;
	
		for(int i =0;i<n;i++) {
			System.out.print(y[i] + " ");
		}
	}

}
