package Lec45;

import java.util.Arrays;

public class ValantineMagic {
	public static void main(String[] args) {
		int[] boys = {2,11,3};
		int[] girls= {5,7,3,2,2};
		int[][] dp = new int[boys.length][girls.length];
		for(int[] i:dp)Arrays.fill(i, -1);
		Arrays.sort(boys);
		Arrays.sort(girls);
		
		System.out.println(minDiff(boys,girls,0,0));
		System.out.println(minDiffTD(boys,girls,0,0,dp));
		
		System.out.println(minDiffBU(boys,girls));
	}
	public static int minDiff(int[] boys,int[] girls,int i,int j) {
		
		if(i == boys.length) {
			return 0;
		}
		if(girls.length == j) {
			return 100000000;
		}
		int select = Math.abs(boys[i]-girls[j])+minDiff(boys, girls, i+1, j+1);
		int reject = minDiff(boys, girls, i, j+1);
		return Math.min(select, reject);
	}
		public static int minDiffTD(int[] boys,int[] girls,int i,int j,int[][] dp) {
		
		if(i == boys.length) {
			return 0;
		}
		if(girls.length == j) {
			return 100000000;
		}
		if(dp[i][j] != -1)return dp[i][j];
		int select = Math.abs(boys[i]-girls[j])+minDiffTD(boys, girls, i+1, j+1,dp);
		int reject = minDiffTD(boys, girls, i, j+1,dp);
		return dp[i][j] = Math.min(select, reject);
	}
	
		
		public static int minDiffBU(int[] boys,int[] girls) {
			int[][] dp = new int[boys.length+1][girls.length+1];
			
			for(int i=boys.length;i>=0;i--) {
				for(int j=girls.length;j>=0;j--) {
					if(i == boys.length) {
						dp[i][j] = 0;
						continue;
					}
					if(j == girls.length) {
						dp[i][j] = 10000000;
						continue;
					}
					int select = Math.abs(boys[i]-girls[j])+dp[i+1][j+1];
					int reject = dp[i][j+1];
					dp[i][j] = Math.min(select, reject);
				}
			}
			return dp[0][0];
		}
}
