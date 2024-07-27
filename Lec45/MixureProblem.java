package Lec45;


public class MixureProblem {
		public static int  mixureRecursion(int[] colors,int si,int ei) {
			if(ei == si) {
				return 0;
			}
			int min  = Integer.MAX_VALUE;
			for(int k=si;k<=ei-1;k++) {
				int fsp = mixureRecursion(colors,si,k);
				int ssp = mixureRecursion(colors,k+1,ei);
				int sw  = colors(colors, si, k) * colors(colors, k+1, ei);
				int total = fsp+ssp+sw;
				if(total < min) {
					min = total;
				}
			}
			return min;
		}
		public static int colors(int[] arr,int i,int j) {
			int sum =0;
			for(int z=i;z<=j;z++) {
				sum+=arr[z];
			}
			return sum%100;
		}
		
		public static int  mixureRecursionTD(int[] colors,int si,int ei,int[][] dp) {
			if(ei == si) {
				return 0;
			}
			if(dp[si][ei] != 0) {
				return dp[si][ei];
			}
			int min  = Integer.MAX_VALUE;
			for(int k=si;k<=ei-1;k++) {
				int fsp = mixureRecursionTD(colors,si,k,dp);
				int ssp = mixureRecursionTD(colors,k+1,ei,dp);
				int sw  = colors(colors, si, k) * colors(colors, k+1, ei);
				int total = fsp+ssp+sw;
				if(total < min) {
					min = total;
				}
			}
			dp[si][ei] = min;
			return min;
		}
		
		public static int mixureBU(int[]colors) {
			int[][] dp  = new int[colors.length][colors.length];
			
			for(int slide=0;slide<colors.length;slide++) {
				for(int si = 0;si<colors.length-slide;si++) {
					int ei = si + slide;
					
					if(si == ei) {
						dp[si][ei] = 0;
					}else {
					int min  = Integer.MAX_VALUE;
					for(int k=si;k<=ei-1;k++) {
						int fsp = dp[si][k];
						int ssp = dp[k+1][ei];
						int sw  = colors(colors, si, k) * colors(colors, k+1, ei);
						int total = fsp+ssp+sw;
						if(total < min) {
							min = total;
						}
					}
					dp[si][ei] = min;
					}
					
				}
			}
			return dp[0][colors.length-1];
		}
		public static void main(String[] args) {
			
			int[] arr = {40,60,20,50};
			int[][] dp = new int[arr.length][arr.length];
			System.out.println(mixureRecursion(arr, 0, arr.length-1));
			System.out.println(mixureRecursionTD(arr, 0, arr.length-1,dp));
			System.out.println(mixureBU(arr));
		}
}
