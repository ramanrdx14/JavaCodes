package Lec44;

import java.util.Arrays;

public class EditDistance {
	
	//Substring function use
	public static int EDistanceRec(String str1,String str2) {
		if(str1.length() == 0) {
			return str2.length();
		}
		if(str2.length() == 0) {
			return str1.length();
		}
		char ch1 = str1.charAt(0);
		char ch2 = str2.charAt(0);
		int ans  = 0;
		String ros1 = str1.substring(1);
		String ros2 = str2.substring(1);
		if(ch1 == ch2) {
			ans = EDistanceRec(ros1, ros2);
		}else {
			int i = EDistanceRec(ros1, str2);
			int d = EDistanceRec(str1, ros2);
			int r = EDistanceRec(ros1, ros2);
			ans   = Math.min(i, Math.min(d, r))+1;
		}
		return ans;
	}
	
	//Virtually Break
	public static int EDistanceRec(String str1,String str2,int vidx1,int vidx2) {
		if(vidx1 == str1.length() || vidx2 == str2.length()) {
			return Math.max(str1.length()-vidx1, str2.length()-vidx2);
		}
		char ch1 = str1.charAt(vidx1);
		char ch2 = str2.charAt(vidx2);
		int ans  = 0;
		if(ch1 == ch2) {
			ans = EDistanceRec(str1, str2,vidx1+1,vidx2+1);
		}else {
			int i = EDistanceRec(str1, str2,vidx1+1,vidx2);
			int d = EDistanceRec(str1, str2,vidx1,vidx2+1);
			int r = EDistanceRec(str1, str2,vidx1+1,vidx2+1);
			ans   = Math.min(i, Math.min(d, r))+1;
		}
		return ans;
	}
	
	
	//Top Down Memoization
	public static int EDistanceTD(String str1,String str2,int vidx1,int vidx2,int[][] dp) {
		if(vidx1 == str1.length() || vidx2 == str2.length()) {
			return Math.max(str1.length()-vidx1, str2.length()-vidx2);
		}
		
		if(dp[vidx1][vidx2] != -1) {
			return dp[vidx1][vidx2];
		}
		char ch1 = str1.charAt(vidx1);
		char ch2 = str2.charAt(vidx2);
		int ans  = 0;
		if(ch1 == ch2) {
			ans = EDistanceTD(str1, str2,vidx1+1,vidx2+1,dp);
		}else {
			int i = EDistanceTD(str1, str2,vidx1+1,vidx2,dp);
			int d = EDistanceTD(str1, str2,vidx1,vidx2+1,dp);
			int r = EDistanceTD(str1, str2,vidx1+1,vidx2+1,dp);
			ans   = Math.min(i, Math.min(d, r))+1;
		}
		dp[vidx1][vidx2] = ans;
		return ans;
	}
	
	public static int EditDistanceBU(String str1,String str2) {
		int n = str1.length()+1;
		int m = str2.length()+1;
		int[][] dp = new int[n][m];
		
		for(int row = str1.length();row>=0;row--) {
			for(int col = str2.length();col>=0;col--) {
				
				if(row == str1.length()) {
					dp[row][col] = str2.length()-col;
				}else if(col == str2.length()) {
					dp[row][col] = str1.length()-row;
				}else {
				
				if(str1.charAt(row) == str2.charAt(col)) {
					dp[row][col] = dp[row+1][col+1];
				}else {
					int i = dp[row+1][col];
					int d = dp[row][col+1];
					int r = dp[row+1][col+1];
					dp[row][col] = Math.min(i, Math.min(d, r))+1;

					}
				}
			}
		}
		return dp[0][0];
	}
	public static void main(String[] args) {
		String s1 = "horse";
		String s2 = "ros";
		int[][] dp = new int[s1.length()][s2.length()];
		for(int i=0;i<dp.length;i++) {
			Arrays.fill(dp[i], -1);
		}
		System.out.println(EDistanceTD(s1, s2,0,0,dp));
		System.out.println(EditDistanceBU(s1, s2));
		
	}
}
