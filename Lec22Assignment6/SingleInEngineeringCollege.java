package Lec22Assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class SingleInEngineeringCollege {
	public static long isItPossible(long[] arr,long mid) {
		long total = 0;
		for(int i=0;i<arr.length;i++) {
			
			if(mid < arr[i]) {
				total = total + arr[i] - mid;
			}
		}
		return total;
	}
    public static long findans(long[] arr,long k) {
    	long ans = 0;
    	Arrays.sort(arr);
    	long lo = 0;
    	long hi = arr[arr.length-1];
    	while(lo <= hi) {
    		long mid = (lo+hi)/2;
    		if(isItPossible(arr,mid) > k) {
    			ans=mid;
    			lo = mid +1;
    		}else if(isItPossible(arr,mid) < k) {
    			hi = mid -1;
    		}else {
    			ans =  mid;
    			return ans;
    		}
    	}
    	return ans;

    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		long[] arr  = new long[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextLong();
		}
		long k   = sc.nextLong();
		System.out.println(findans(arr,k));
	}

}
