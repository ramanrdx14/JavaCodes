package Lec14Assignment4;

import java.util.Scanner;

public class isFirstVersionIsBad {
	public static void isBadVersion(int a) {
		int lo = 0;
		int hi = a;
		int ans= 0;
		while(lo <= hi) {
			int mid= lo+(hi-lo)/2;
			if(isBad(mid)) {
				ans = mid;
				hi  = mid-1;
			}else {
				lo  = mid + 1;
			}
		}
		System.out.println(ans);
	}
	private static boolean isBad(int mid) { 		//leetcode badversion method inbuilt
		if(mid == 4 || mid == 5 || mid == 1) return true;
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		isBadVersion(n);
	}

}
