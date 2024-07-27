package Lec10Assignment3;
import java.util.*;
public class ArrayLinearSearch {
    public static int linearSearch(long[] arr,long X) {
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i] == X) {
    			return i;
    		}
    	}
    	return -1;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		long[] arr  = new long[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextLong();
		}
		long X  = sc.nextLong();
		System.out.println(linearSearch(arr, X));
	}

}
