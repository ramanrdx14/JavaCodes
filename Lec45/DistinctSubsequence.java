package Lec45;
import java.util.*;
public class DistinctSubsequence {
	public int numDistinct(String s, String t) {
        int[][] dp = new int[s.length()][t.length()];
        for(int[] i:dp)Arrays.fill(i,-1);
        int ans = numDistinctTD(s,t,0,0,dp);
        
       return numDistinctBU(s,t);
       
        //return ans;
    }

    //DP - Top Down
    public int numDistinctTD(String s, String t,int vidx1,int vidx2,int[][] dp) {
        if(vidx2== t.length()){
            return 1;
        }
        if(vidx1 == s.length()){
            return 0;
        }
        if(dp[vidx1][vidx2] != -1){
            return dp[vidx1][vidx2];
        }
        int inc = 0;
        int exc = 0;
        if(s.charAt(vidx1) == t.charAt(vidx2)){
           inc =  numDistinctTD(s,t,vidx1+1,vidx2+1,dp);
        }
        exc    =  numDistinctTD(s,t,vidx1+1,vidx2,dp);
        return dp[vidx1][vidx2] = inc + exc;
    }


    //DP - BU
    public int numDistinctBU(String s, String t) {
       
        int[][] dp = new int[s.length()+1][t.length()+1];
         
        for(int i=s.length();i>=0;i--){
            for(int j=t.length();j>=0;j--){

                if(j == t.length()){
                    dp[i][j] = 1;
                    continue;
                }
                if(i == s.length()){
                    dp[i][j] = 0;
                    continue;
                }
                int inc = 0;
                int exc = 0;
                if(s.charAt(i) == t.charAt(j)){
                inc =  dp[i+1][j+1];
                }
                exc    =  dp[i+1][j];
                dp[i][j] = inc + exc;
                
            }
        }
        return dp[0][0];
    }
}
