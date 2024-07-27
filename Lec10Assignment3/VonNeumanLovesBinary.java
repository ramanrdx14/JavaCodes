package Lec10Assignment3;

import java.util.Scanner;

public class VonNeumanLovesBinary {
    public static void vonBinary(long[] arr) {
    	for(int i=0;i<arr.length;i++) {
    		System.out.println(binaryToDecimal(arr[i]));
    	}
    }
    public static long binaryToDecimal(long i) {
    	long number = 0;
    	int mul     = 1;
    	while(i > 0) {
    		long rem  = i%10;
    		number   += rem*mul;
    		i        /= 10;
    		mul      *= 2;
    	}
    	return number;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		long[] arr  = new long[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		   }
		vonBinary(arr);
	}
}
