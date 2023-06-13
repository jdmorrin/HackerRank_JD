package com.hr.diagonaldifference;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int ltr = 0, rtl= 0, result = 0;
        
        // Left to right sum
        for(int i = 0; i<arr.size(); i++){
            List<Integer> l = arr.get(i);
             for(int j = 0; j<l.size();j++){
                 if(i==j)
                    ltr += l.get(j);
             }
        }
        System.out.println("Left to right sum:"+ltr);
        System.out.println("Here " + rtl);
        
        // Right to left sum
        for(int i = 0; i < arr.size(); i++){
            List<Integer> l = arr.get(i);
             for(int j = l.size()-1; j>=0;j--){
            	 //System.out.println(rtl);
                 if(j== arr.size() - i - 1)
                	//System.out.print(l.get(j) + "+");
                    rtl += l.get(j);
             }
        }
        System.out.println("Right to left sum: "+rtl);
        
        result = ltr - rtl;
        return result;
    }

}


public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int n = s.nextInt();
		List <List<Integer>> matrix = new ArrayList<>();
		
		// Initialize liost
		for(int i = 0; i< n; i++) {
			List <Integer> l = new ArrayList<>();
			
			for(int j = 0;j<n;j++) {
				l.add(r.nextInt(10));
			}
			
			matrix.add(l);
		}
		
		// Print list
		for(int i = 0; i< matrix.size(); i++) {
			for(int j = 0;j<matrix.get(i).size();j++) {
				System.out.print(matrix.get(i).get(j)+"--");
			}
			System.out.println();
		}
		
		System.out.println(Result.diagonalDifference(matrix));
	}

}
