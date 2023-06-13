package hr001_LonelyInteger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Result {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
    
        for(int j = 0;j<a.size();j++){
            boolean duplicatesFound = false;
            System.out.println(a.get(j));
            
            for(int i = 0; i<a.size();i++){
              if(j != i /*&& a.get(j) == a.get(i)*/){
            	  System.out.println("---"+a.get(i));
            	  if(a.get(j) == a.get(i)) {
            		  duplicatesFound = true;
            	  }
              }
            }
            
            if(!duplicatesFound)
          	  System.out.println(a.get(j));
        }
        
        return 0;
    }

}

public class LonelyInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		List<Integer> a = new ArrayList<>();
		//int [] a = new int[n];
		
		for(int i = 0; i<n; i++) {
			a.add(s.nextInt());
		}

		System.out.println(Result.lonelyinteger(a));
	}

}
