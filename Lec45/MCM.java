package Lec45;

public class MCM {
	public static int MCMResult(int[]arr ,int si,int ei) {
		if(si+1 == ei) {
			return 0;
		}
		int min = Integer.MAX_VALUE;
		for(int k=si+1;k<=ei-1;k++) {
			int fp = MCMResult(arr, si, k);
			int sp = MCMResult(arr, k, ei);
			int sw = arr[si]*arr[k]*arr[ei];
			int total = fp+sp+sw;
			if(total < min) {
				min = total;
			}
		}
		return min;
	}
	
	public static int MCMResultTD(int[]arr ,int si,int ei,int[][] dp) {
		if(si+1 == ei) {
			return 0;
		}
		if(dp[si][ei] != 0) {
			return dp[si][ei];
		}
		int min = Integer.MAX_VALUE;
		for(int k=si+1;k<=ei-1;k++) {
			int fp = MCMResultTD(arr, si, k,dp);
			int sp = MCMResultTD(arr, k, ei,dp);
			int sw = arr[si]*arr[k]*arr[ei];
			int total = fp+sp+sw;
			if(total < min) {
				min = total;
			}
		}
		dp[si][ei] = min;
		return min;
	}
	
	public static int MCMResultBU(int[] arr) {
		int[][] dp = new int[arr.length][arr.length];
		
		for(int slide = 1;slide<=arr.length-1;slide++) {
			
			for(int si=0;si<=arr.length-slide-1;si++) {
				int ei = si+slide; //si + slide
				
				if(si+1 == ei) {
					dp[si][ei] = 0;
				}else {
					int min = Integer.MAX_VALUE;
					//K splits
					for(int k=si+1;k<=ei-1;k++) {
						
						int fp = dp[si][k];
						int sp = dp[k][ei];
						
						int sw = arr[si]*arr[k]*arr[ei];
						int total = fp+sp+sw;
						if(total < min) {
							min = total;
						}
					}
					dp[si][ei] = min;
				}
				
			}
			
		}
		return dp[0][arr.length-1];
	}
	public static void main(String[] args) {
		int[] arr = {4,2,3,5};
		System.out.println(MCMResult(arr, 0, arr.length-1));
		System.out.println(MCMResultTD(arr, 0, arr.length-1,new int[arr.length][arr.length]));
		System.out.println(MCMResultBU(arr));
	}
}
