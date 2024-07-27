package Lec22Assignment6;

import java.util.Scanner;

public class AllIndicesProblem {

	public static void firstIndex(int[] arr,int m,int si) {
		if(arr.length == si) {
			return;
		}
		if(arr[si] == m) {
			System.out.print(si+" ");
		}
		firstIndex(arr, m, si+1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int[] arr  = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
	firstIndex(arr,m,0);

	}

}
