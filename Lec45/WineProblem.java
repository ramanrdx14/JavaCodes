package Lec45;

import java.util.Arrays;

public class WineProblem {
	public static int wineProblemRec(int[] arr , int si,int ei,int yr) {
		if(si == ei) {
			return arr[si] * yr;
		}
		
		int start = wineProblemRec(arr, si+1, ei, yr+1) + arr[si]*yr;
	    int end   = wineProblemRec(arr, si, ei-1, yr+1) + arr[ei]*yr;
	    
	    return Math.max(start, end);
	    
	}
	
	public static int wineProblemTD(int[] arr,int si,int ei,int[][] dp) {
		int yr = (arr.length - (ei-si+1)) + 1;
		if(ei == si) {
			return arr[si]*yr;
		}
		
		if(dp[si][ei] != -1) {
			return dp[ei][si]*yr;
		}
		int start = wineProblemTD(arr, si+1, ei, dp) + arr[si]*yr;
	    int end   = wineProblemTD(arr, si, ei-1, dp) + arr[ei]*yr;
	    
	    int ans   = Math.max(start, end);
	    dp[si][ei]= ans;
	    return ans;
	}
	
	//BOTTOM UP Row Traversal
	public static int wineProblemBU(int[] arr) {
		int n      = arr.length;
		int[][] dp = new int[n][n];
		for(int row = n-1;row>=0;row--) {
			for(int col=0;col<n;col++) {
				
				int yr = (n - (col-row+1)) + 1;
				
				if(row == col) {
					dp[row][col] = arr[row]*yr;
				}else if(col > row){
					int start = dp[row+1][col] + arr[row]*yr;
					int end   = dp[row][col-1] + arr[col]*yr;
					int ans   = Math.max(start, end);
					dp[row][col] = ans;
				}
			}
		}
		return dp[0][n-1];
	}
	
	//BOTTOM UP DIGANOLLY 
    public static int wineProblemBU1(int[]prices){
        int[][] dp = new int[prices.length][prices.length];
        for(int slide=0;slide<=prices.length-1;slide++){
            for(int si = 0;si<=prices.length-slide-1;si++){
                
                int ei = si+slide;
                
                int yr = prices.length - (ei-si+1)+1;
                if(ei == si){
                    dp[si][ei] = prices[si]*yr;
                }else{
                    int left = dp[si+1][ei]+yr*prices[si];
                    int right= dp[si][ei-1]+yr*prices[ei];
                    dp[si][ei] = Math.max(left,right);
                }
            }
        }
        return dp[0][prices.length-1];
    }
	public static void main(String[] args) {
		int[] arr = {2,3,5};
		int[][] dp= new int[arr.length][arr.length];
		for(int i=0;i<arr.length;i++) {
			Arrays.fill(dp[i], -1);
		}
		System.out.println(wineProblemRec(arr,0,arr.length-1,1));
		System.out.println(wineProblemTD(arr,0,arr.length-1,dp));
		System.out.println(wineProblemBU(arr));
	}
}
