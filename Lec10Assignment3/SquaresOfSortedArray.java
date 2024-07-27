package Lec10Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class SquaresOfSortedArray {
    public static void squareOfArray(int[] arr) {
    	for(int i=0;i<arr.length;i++) {
    		arr[i] = (int)Math.pow(arr[i], 2);
    	}
    	Arrays.sort(arr);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int[] arr  = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		squareOfArray(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
