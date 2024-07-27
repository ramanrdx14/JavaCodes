package Lec45;
import java.util.*;
public class DecodeString {

    public int numDecodings(String s) {
        int[] dp = new int[s.length()];
        Arrays.fill(dp,-1);
        //return numDecodings(s,0,dp);
        return numDecodingsBU(s);
    }
    public int numDecodings(String s,int si,int[] dp) {
        if(si==s.length()){
            return 1;
        }
        if(s.charAt(si) == '0'){
            return 0;
        }
        if(dp[si] != -1)return dp[si];
        int takechar1 = numDecodings(s,si+1,dp);
        int takechar2 = 0;
        if(si+1 <s.length()){
        if(Integer.parseInt(s.substring(si,si+2)) <=26){
                takechar2 = numDecodings(s,si+2,dp);
            }
        }
    
        return dp[si] = takechar1+takechar2;
    }

   public int numDecodingsBU(String s){
     
     int n = s.length();
     int[] dp = new int[n+1];
     dp[n] = 1;
     for(int si=n-1;si>=0;si--){
            if(s.charAt(si) == '0'){
            dp[si] = 0;
            continue;
            }
        int takechar1 = dp[si+1];
        int takechar2 = 0;
        if(si+1 <s.length()){
        if(Integer.parseInt(s.substring(si,si+2)) <=26){
                takechar2 = dp[si+2];
            }
        }
        dp[si] = takechar1+takechar2;
     }
     return dp[0];
   }

}
