package Lec17Assignment5;

import java.util.Scanner;

public class CB_Number {
    public static boolean checkCbNumber(long n) {
    	if(n == 0 || n == 1) {
    		return false;
    	}
    	int[] arr = {2,3,5,7,11,13,17,19,23,29 };
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i] == n) {
    			return true;
    		}
    	}
    	for(int i=0;i<arr.length;i++) {
    		if(n % arr[i] == 0) {
    			return false;
    		}
    	}
    	return true;
    }
    public static void substring(String str) {
    	boolean[] visited = new boolean[str.length()];
    	int count = 0;
    	for(int len=1;len<=str.length();len++) {
    		 for(int j = len;j<=str.length();j++) {
    			 int i = j - len;
    			 if(checkCbNumber(Long.parseLong(str.substring(i,j)))) {
    				 if(isNotVisited(visited, i, j-1)) {
    					 count ++;
    					 for(int k=i;k<j;k++) {
    						 visited[k] = true;
    					 }
    				 }
    			 }
    		 }
    	}
    	System.out.println(count);
    }
    public static boolean isNotVisited(boolean[] visited,int i ,int j) {
    	for(int k=i;k<=j;k++) {
    		if(visited[k] == true) {
    			return false;
    		}
 
    	}
    	return true;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		substring(str);
	}

}
