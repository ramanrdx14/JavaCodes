package Lec10Assignment3;

import java.util.Scanner;

public class MajorityElement {
    public static void majorityElement(int[]arr) {
    	for(int i=0;i<arr.length;i++) {
    		int count = 0;
    		for(int j=i;j<arr.length;j++) {
    			if(arr[i] == arr[j]) {
    				count ++;
    			}
    		}
    		if(count > arr.length/2) {
    			System.out.println(arr[i]);
    		}
    	}
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int[] arr  = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		majorityElement(arr);
	}

}
