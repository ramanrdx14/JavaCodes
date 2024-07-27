package Lec10Assignment3;

import java.util.Scanner;

public class RunningSumOfArray {
    public static int[] runningSum(int[] nums) {
    	int[] arr = new int[nums.length];
        arr[0]    = nums[0];
        for(int i=1;i<arr.length;i++) {
    		arr[i] = nums[i]+arr[i-1];
    	}
        return arr;
    }
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int[] arr  = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		arr = runningSum(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
