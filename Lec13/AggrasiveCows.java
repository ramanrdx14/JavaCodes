package Lec13;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class AggrasiveCows {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t      = sc.nextInt();
		while(t-->0) {
		int n      = sc.nextInt();
		int cows      = sc.nextInt();
		int[] stalls  = new int[n];
		for(int i=0;i<stalls.length;i++) {
			stalls[i] = sc.nextInt();
		}
		Arrays.sort(stalls);
		System.out.println(largest_min_dist(stalls, cows));
		}
	}
   public static int largest_min_dist(int[] stalls,int cows) {
	   int lo = 0;
	   int hi = stalls[stalls.length-1] - stalls[0]; 
	   int ans= 0;
	   while(lo <= hi) {
		   int mid = (lo+hi)/2;
		   if(isItPossibleToPlaceCows(stalls,cows,mid)) {
			   ans = mid;
			   lo  = mid + 1;
		   }else {
			   hi  = mid - 1;
		   }
	   }
	   return ans;
   }
   public static boolean isItPossibleToPlaceCows(int[] stalls,int cows,int mid) {
	   int cowsSitted = 1;
	   int pos        = stalls[0];
	   int i          = 1;
	   while(i < stalls.length) {
		   if((stalls[i] - pos) >= mid ) {
			   cowsSitted ++;
			   pos = stalls[i];
			   
		   }
		   if(cowsSitted == cows) {
			   return true;
		   }
		   i++;
	   }
	   return false;
   }
}
