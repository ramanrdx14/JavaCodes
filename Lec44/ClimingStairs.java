package Lec44;

public class ClimingStairs {
	public static int mccs(int[] arr,int si) {
		if(si >= arr.length) {
			return 0;
		}
		int onestep = arr[si]+mccs(arr,si+1);
		int twostep = arr[si]+mccs(arr,si+2);
		return Math.min(onestep, twostep);
	}
	
	
	public int mccsBU(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        dp[n-1]  = cost[n-1];
        dp[n-2]  = cost[n-2];

        for(int i=n-3;i>=0;i--){
            int take1step = dp[i+1];
            int take2step = dp[i+2];
            dp[i] = cost[i]+Math.min(take1step,take2step);
        }
        return Math.min(dp[0],dp[1]);
    }
	
	
	
	public int mccsTD(int[] arr,int si,int[] dp){
        if(si >= arr.length){
            return 0;
        }
        if(dp[si] != -1){
            return dp[si];
        }
        int take1step = arr[si]+mccsTD(arr,si+1,dp);
        int take2step = arr[si]+mccsTD(arr,si+2,dp);
        int ans       = Math.min(take1step,take2step);
        dp[si] = ans;
        return ans;
    }
	public static void main(String[] args) {
		int[] arr = {1,100,1,1,1,100,1,1,100,1};
		System.out.println(Math.min(mccs(arr,0), mccs(arr,1)));
	}
}
