package Lec45;

public class Knapsack {
	public static int knapsackR(int[] weights,int[] price,int maxweight,int si) {
		if(maxweight == 0 || si == weights.length) {
			return 0;
		}
		
		int choose = 0;
		
		if(maxweight >=weights[si]) {
			choose    = knapsackR(weights, price, maxweight-weights[si], si+1)+price[si];
		}
		
		int notchoose = knapsackR(weights, price, maxweight, si+1);
		return Math.max(choose, notchoose);
	}
	
	public static int knapsackTD(int[] weights,int[] price,int maxweight,int si,int[][] dp) {
		if(maxweight == 0 || si == weights.length) {
			return 0;
		}
		if(dp[si][maxweight] != 0) {
			return dp[si][maxweight];
		}
		int choose = 0;
		
		if(maxweight >=weights[si]) {
			choose    = knapsackTD(weights, price, maxweight-weights[si], si+1,dp)+price[si];
		}
		
		int notchoose = knapsackTD(weights, price, maxweight, si+1,dp);
		int ans       = Math.max(choose, notchoose);
		dp[si][maxweight] = ans;
		return ans;
	}
	
	public static int knapsackBU(int[] weights,int[] price,int maxweight) {
		int[][] dp = new int[weights.length+1][maxweight+1];
		
		for(int row = weights.length-1;row>=0;row--) {
			for(int col =1;col<=maxweight;col++) {
				
				int e = dp[row+1][col];
				int i =0;
				if(col>=weights[row]) {
					i = dp[row+1][col - weights[row]] + price[row];
				}
				int ans = Math.max(i, e);
				dp[row][col] = ans;
			}
		}
		return dp[0][maxweight];
	}
	public static void main(String[] args) {
		int[] weights = {1,3,5};
		int[] price   = {1,2,7};
		int maxweight = 7;
		System.out.println(knapsackR(weights,price,maxweight,0));
		int[][] dp = new int[weights.length][maxweight+1];
		System.out.println(knapsackTD(weights,price,maxweight,0,dp));
		System.out.println(knapsackBU(weights, price, maxweight));
	}
}
