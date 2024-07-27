package Lec45;

public class CoinChange2 {

	public static int NoOfWays(int[] coins,int si,int ammount) {
		if(ammount == 0) {
			return 1;
		}
		if(coins.length == si) {
			return 0;
		}
		int inc = 0;
		int exc = 0;
		
		if(ammount - coins[si] >=0) {
			inc = NoOfWays(coins, si, ammount-coins[si]);
		}
		exc = NoOfWays(coins, si+1, ammount);
		
		return inc + exc;
	}
	public static int NoOfWaysTD(int[] coins,int si,int ammount,int[][] dp) {
		if(ammount == 0) {
			return 1;
		}
		if(coins.length == si) {
			return 0;
		}
		
		if(dp[si][ammount] != 0) {
			return dp[si][ammount];
		}
		int inc = 0;
		int exc = 0;
		
		if(ammount - coins[si] >=0) {
			inc = NoOfWaysTD(coins, si, ammount-coins[si],dp);
		}
		exc = NoOfWaysTD(coins, si+1, ammount,dp);
		
		return dp[si][ammount]=  inc + exc;
	}
	
	public static int NoOfWaysBU(int[] coins,int ammount) {
		int[][] dp = new int[coins.length+1][ammount+1];
		for(int i=0;i<dp.length;i++) {
			dp[i][0] = 1;
		}
		for(int i=coins.length-1;i>=0;i--) {
			for(int j=1;j<=ammount;j++) {
				
				int exc = dp[i+1][j];
				int inc = 0;
				if(j-coins[i] >=0) {
					inc = dp[i][j-coins[i]];
				}
				dp[i][j] = inc+exc;
			}
		}
		
		return dp[0][ammount];
	}
	public static void main(String[] args) {
		int[] arr = {1,2,5};
		int amount = 5;
		int[][] dp = new int[arr.length][amount+1];
		System.out.println(NoOfWays(arr, 0, amount));
		System.out.println(NoOfWaysTD(arr, 0, amount,dp));
		System.out.println(NoOfWaysBU(arr,amount));
		
	}

}
