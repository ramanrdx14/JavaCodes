package Lec14Assignment4;

import java.util.Scanner;

public class SquareRootOfX {
    public static long findSqRoot(long x) {
    	long lo = 0;
    	long hi = x;
    	long ans= 0;
    	while(lo <= hi) {
    		long mid = lo+(hi-lo)/2;
    		if(mid*mid == x) {
    			return mid;
    		}else if(mid*mid > x) {
    			hi = mid -1;
    		}else {
    			ans = mid;
    			lo = mid +1;
    		}
    	}
    	return ans;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x     = sc.nextLong();
		System.out.println(findSqRoot(x));

	}

}
