package Lec22Assignment6;

import java.util.Scanner;

public class SubsetSum {
	static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int[] arr  = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int  k  = sc.nextInt();
		subsetSumtoK(arr,k,0,"");
		System.out.println();
	    System.out.println(count);
	}

	private static void subsetSumtoK(int[] arr, int k,int si,String result) {
		if(si == arr.length) {
			if(k == 0) {
				System.out.print(result);
				System.out.print(" ");
				count++;
			}
			return;
		}
		subsetSumtoK(arr, k-arr[si], si+1,result+arr[si]+" ");
		subsetSumtoK(arr, k, si+1, result);
		
	}

}
