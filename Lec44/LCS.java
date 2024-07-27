package Lec44;

import java.util.Arrays;

public class LCS {


	//LCS Recursion Using Substirng 
	public static int LCS(String s1,String s2) {
		if(s1.length() == 0 || s2.length() == 0) {
			return 0;
		}

		int ch1 = s1.charAt(0);
		int ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);
		int ans     = 0;
		if(ch1 == ch2) {
			ans = LCS(ros1,ros2)+1;
		}else {
			int op1     = LCS(s1,ros2);
			int op2     = LCS(ros1,s2);
			ans         = Math.max(op1, op2);
		}
		return ans;
	}




	//LCS Recursion Using Virtual Index
	public static int LCSVirtual(String s1,String s2,int vidx1,int vidx2) {
		if(s1.length() <= vidx1 || s2.length() <= vidx2) {
			return 0;
		}

		int ch1 = s1.charAt(vidx1);
		int ch2 = s2.charAt(vidx2);
		int ans     = 0;
		if(ch1 == ch2) {
			ans = LCSVirtual(s1,s2,vidx1+1,vidx2+1)+1;
		}else {
			int op1     = LCSVirtual(s1,s2,vidx1,vidx2+1);
			int op2     = LCSVirtual(s1,s2,vidx1+1,vidx2);
			ans         = Math.max(op1, op2);
		}
		return ans;
	}


	public static int LCSVirtualTD(String s1,String s2,int vidx1,int vidx2,int[][] dp) {
		if(s1.length() <= vidx1 || s2.length() <= vidx2) {
			return 0;
		}

		if(dp[vidx1][vidx2] != -1) {
			return dp[vidx1][vidx2];
		}
		int ch1 = s1.charAt(vidx1);
		int ch2 = s2.charAt(vidx2);
		int ans     = 0;
		if(ch1 == ch2) {
			ans = LCSVirtualTD(s1,s2,vidx1+1,vidx2+1,dp)+1;
		}else {
			int op1     = LCSVirtualTD(s1,s2,vidx1,vidx2+1,dp);
			int op2     = LCSVirtualTD(s1,s2,vidx1+1,vidx2,dp);
			ans         = Math.max(op1, op2);
		}

		dp[vidx1][vidx2] = ans;
		return ans;
	}
	
	
	public static int LCSBU(String s1,String s2) {
		int[][] dp = new int[s1.length()+1][s2.length()+1];
		
		for(int row = s1.length()-1;row>=0;row--) {
			for(int col=s2.length()-1;col>=0;col--) {
				if(s1.charAt(row) == s2.charAt(col)) {
					dp[row][col]  = (dp[row+1][col+1]) +1;
				}else {
					int op1 = dp[row+1][col];
					int op2 = dp[row][col+1];
					dp[row][col] = Math.max(op1, op2);
				}
			}
		}
		return dp[0][0];
	}
	public static void main(String[] args) {
		String s1 = "1110";
		String s2 = "10011";
		
		//System.out.println(LCS(s1, s2));
		//System.out.println(LCSVirtual(s1, s2, 0, 0));
		
		
		//LCS  Top Down
		
		int[][] dp = new int[s1.length()][s2.length()];
		for(int i=0;i<dp.length;i++) {
			Arrays.fill(dp[i], -1);
		}
		
		System.out.println(LCSVirtualTD(s1,s2, 0, 0,dp));
		System.out.println(LCSBU(s1, s2));
	}

}
