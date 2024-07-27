package Lec10Assignment3;

import java.util.Scanner;

public class MaximumCircularSum {
	public static int maxSubArraySum(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
			ans  = Math.max(ans, sum);
			if(sum < 0) {
				sum = 0;
			}
		}
		return ans;
	}
	private static int minSubArraySum(int[] arr) {
		int ans = Integer.MAX_VALUE;
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
			ans  = Math.min(ans, sum);
			if(sum > 0) {
				sum = 0;
			}
		}
		return ans;
	}
	public static int arraySum(int[] arr) {
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
    public static void maximumCurcularSum(int[] arr) {
    	int maxsubarraysum = maxSubArraySum(arr);
    	int minsubarraysum = minSubArraySum(arr);
    	int totalarraysum  = arraySum(arr);
    	System.out.println(maxsubarraysum+" "+minsubarraysum+" "+totalarraysum);
    	System.out.println(Math.max(maxsubarraysum,(totalarraysum-minsubarraysum) ));
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t      = sc.nextInt();
		while(t -- > 0) {
		int n      = sc.nextInt();
		int[] arr  = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		 }
		maximumCurcularSum(arr);
	   }
	}

}
