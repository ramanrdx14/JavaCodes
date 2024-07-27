package Lec22Assignment6;

import java.util.Scanner;

public class LastIndex {

	public static int lastIndex(int[] arr,int m,int si) {
		if(arr.length == si) {
			return -1;
		}
		
		int k = lastIndex(arr, m, si+1);
		if(k == -1) {
			if(arr[si] == m) {
				k = si;
			}
		}
			return k;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int[] arr  = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		System.out.println(lastIndex(arr,m,0));

	}

}
