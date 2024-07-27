package Lec45;
import java.util.*;
public class RodCuttingProblem {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n      = sc.nextInt();
        int[] arr  = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
       int k    = sc.nextInt();
       int[] dp = new int[k];
       System.out.println(RoadCuttingRecursive(arr,k,dp));
    }
    public static int RoadCuttingRecursive(int[] prices,int n,int[]dp){
       if(n <= 0) {
    	   return 0;
       }
       if(dp[n] != 0)return dp[n];
       int max = Integer.MIN_VALUE;
       for(int i=0;i<n;i++) {
    	   int cut = i+1;
    	   int sp = prices[i]+RoadCuttingRecursive(prices, n-cut,dp);
    	   max    = Math.max(max, sp);
       }
       return dp[n] = max;
    }
}	
