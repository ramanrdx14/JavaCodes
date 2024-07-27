package Lec10Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTargetSumTripplet {
    public static void targetSumTripplet(int[] arr,int sum) {
    	Arrays.sort(arr);
    	for(int i=0;i<arr.length;i++) {
    		int newsum = sum - arr[i];
    		if(i==0 || i > 0 && arr[i] != arr[i-1])
    		targetSumPair(arr, newsum, i);
    	}
    }
    public static void targetSumPair(int[] arr,int sum,int i) {
    	int left = i+1;
    	int right = arr.length -1;
    	while(left < right) {
    		if(arr[left]+arr[right] < sum) {
    			left++;
    		}else if(arr[left]+arr[right] > sum) {
    			right--;
    		}else {
    			System.out.println(arr[i]+", "+arr[left]+" and "+arr[right]);
    			while(left < right && arr[left] == arr[left+1])left++;
    			while(left < right && arr[right]== arr[right-1])right--;
    			left++;
    			right--;
    		}
    	}
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int[] arr  = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int sum = sc.nextInt();
		targetSumTripplet(arr,sum);
	}
}
