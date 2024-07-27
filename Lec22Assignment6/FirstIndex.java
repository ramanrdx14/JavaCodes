package Lec22Assignment6;

import java.util.Scanner;

public class FirstIndex {
	public static int firstIndex(int[] arr,int m,int si) {
		if(arr.length == si) {
			return -1;
		}
		if(arr[si] == m) {
			return si;
		}
		int index = firstIndex(arr, m, si+1);
		return index;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int[] arr  = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
	 System.out.println(firstIndex(arr,m,0));

	}

}
