package Lec10Assignment3;

import java.util.Scanner;

public class ArraysMaxValue {
    public static int max(int[] arr) {
    	int maxi = Integer.MIN_VALUE;
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i] > maxi) {
    			maxi = arr[i];
    		}
    	}
    	return maxi;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int[] arr  = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(max(arr));
	}

}
