package Lec10Assignment3;
import java.util.*;
public class CalculateTheSum {
    public static void sumCalculate(long[] arr,int X) {
    	long[] temp = new long[arr.length]; //Copy Elements
    	for(int i=0;i<arr.length;i++) {
    		temp[i] = arr[i];
    	}
    	X = Math.abs((arr.length - X))%arr.length;
    	for(int i=0;i<arr.length;i++) {
    		
    	    //finding the pos in circular array
    		arr[i] = temp[i]+temp[X%arr.length];
    		X++;
    	}
    	
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		long[] arr  = new long[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int query = sc.nextInt();
		while(query-- > 0) {
			int X   = sc.nextInt();
			sumCalculate(arr,X);
		}
		long sum = 0;
		for(long l:arr) {
			sum+=l;
		}
		System.out.println(sum%(1000000000+7));
	}

}
