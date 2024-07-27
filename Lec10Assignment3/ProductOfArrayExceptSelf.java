package Lec10Assignment3;
import java.util.*;
public class ProductOfArrayExceptSelf {
    public static void productOfArrayExceptSelf(long[] arr) {
    	long[] left = new long[arr.length];
    	long[] right= new long[arr.length];
    	left[0] = 1;
    	for(int i=1;i<arr.length;i++) {
    		left[i] = arr[i-1]*left[i-1];
    	}
    	right[arr.length-1] = 1;
    	for(int j=arr.length-2;j>=0;j--) {
    		right[j] = arr[j+1] * right[j+1];
    	}
    	for(int i=0;i<arr.length;i++) {
    		arr[i] = left[i]*right[i];
    	}
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		long[] arr  = new long[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		productOfArrayExceptSelf(arr);
		for(long i:arr) {
			System.out.print(i+" ");
		}
	}

}
