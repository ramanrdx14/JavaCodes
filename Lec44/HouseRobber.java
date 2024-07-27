package Lec44;

public class HouseRobber {

	
	public static int RobberRecursion(int[] arr,int si) {
		if(si >= arr.length) {
			return 0;
		}
		
		int loot = arr[si] + RobberRecursion(arr, si+2);
		
		int dontloot = RobberRecursion(arr, si+1);
		
		int maxloot  = Math.max(loot, dontloot);
		
		return maxloot;
	}
	
	public static int RobberTD(int[] arr,int si,int[] dp) {
		if(si >= arr.length) {
			return 0;
		}
		
		if(dp[si] != 0) {
			return dp[si];
		}
		
		int loot = arr[si] + RobberTD(arr, si+2, dp);
		
		int dontloot = RobberTD(arr, si+1, dp);
		
		int maxloot  = Math.max(loot, dontloot);
		
		dp[si]       = maxloot;
		
		return maxloot;
	}
	
	
	public static int RobberRecursionReverse(int[] arr,int ei) {
		if(ei < 0) {
			return 0;
		}
		int rob = arr[ei] + RobberRecursionReverse(arr,ei-2);
		int notrob = RobberRecursionReverse(arr,ei-1);
		return Math.max(rob, notrob);
	}
	
	
	public static int houseRobberBUF(int[] arr)
	{
		int  n   = arr.length;
		int[] dp = new int[n];
		dp[0]    = arr[0];
		dp[1]    = Math.max(arr[0], arr[1]);
		
		for(int i=2;i<dp.length;i++) {
			int rob = arr[i]+dp[i-2];
			int notrob = dp[i-1];
			dp[i]      = Math.max(rob, notrob);
		}
		return dp[n-1];
	}
	
	public static int houseRobberBackward(int[] arr) {
		int n    = arr.length;
		int[] dp = new int[n];
		dp[n-1]  = arr[n-1];
		dp[n-2]  = Math.max(arr[n-1], arr[n-2]);
		for(int i=n-3;i>=0;i--) {
			int rob = arr[i] + dp[i+2];
			int notrob = dp[i+1];
			dp[i]      = Math.max(rob, notrob);
		}
		
		return dp[0];
	}
	public static void main(String[] args) {
		int[] arr = {6,5,5,7,4};
		int[] dp  = new int[arr.length];
		RobberTD(arr,0,dp);
		System.out.println(houseRobberBackward(arr));
		 
	}

}
