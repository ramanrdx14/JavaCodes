package Lec46DpQuestions;

public class PallindromeSubstrings {
	//yahan axis orbit approach bhi use karskate ho
	public int countSubstrings(String s) {
        boolean[][] dp = new boolean[s.length()+1][s.length()+1];
        int count = 0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if(isPallindrome(s,i,j-1,dp)){
                    count++;
                }
            }
        }
        return count;
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
    public static void main(String[] args) {
		System.out.println(Integer.parseInt("06"));
	}
}
