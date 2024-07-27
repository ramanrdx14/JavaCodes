package Lec46DpQuestions;

public class LongestPallindromicSubstring {
	 public String longestPalindrome(String s) {
	        boolean[][] dp = new boolean[s.length()+1][s.length()+1];
	        int max = Integer.MIN_VALUE;
	        String ans = "";
	        for(int i=0;i<s.length();i++){
	            for(int j=i+1;j<=s.length();j++){
	                if(isPallindrome(s,i,j-1,dp)){
	                    if((j-i+1) >= max){
	                        max = (j-i+1);
	                        ans = s.substring(i,j);
	                    }
	                }
	            }
	        }
	        return ans;
	    }
	    public boolean isPallindrome(String s,int si,int ei,boolean[][] dp){
	        if(si>=ei){
	            return true;
	        }
	        if(dp[si][ei] == true){
	            return true;
	        }
	        if(s.charAt(si) != s.charAt(ei)){
	            return false;
	        }
	        return dp[si][ei] = isPallindrome(s,si+1,ei-1,dp);
	    }
}
