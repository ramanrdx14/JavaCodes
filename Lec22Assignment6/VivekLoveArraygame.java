package Lec22Assignment6;

import java.util.Scanner;

public class VivekLoveArraygame {
	public static int vivekLoveArrayGame(int[] arr,int si,int ei) {
		for(int mid=si;mid<ei;mid++) {
		int sum1 = 0;  //First array sum
		for(int i=si;i<=mid;i++) {
			sum1+=arr[i];
		}
		int sum2 = 0; // 2nd array sum
		for(int j=mid+1;j<=ei;j++) {
			sum2+=arr[j];
		}
		if(sum1 == sum2) {
			int leftans = vivekLoveArrayGame(arr, si, mid);
			int rightans= vivekLoveArrayGame(arr, mid+1, ei);
			return Math.max(leftans, rightans)+1;
		 	}
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t      = sc.nextInt();
		while(t -->  0) {
		int n      = sc.nextInt();
		int[] arr  = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			}
		 System.out.println(vivekLoveArrayGame(arr,0,arr.length-1));
		}
	}
}
