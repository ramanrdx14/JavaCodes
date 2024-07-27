package Lec44;
import java.util.*;
public class UnCrossedLines {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int[][]dp = new int[nums1.length][nums2.length];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        //return helper(nums1,nums2,0,0,dp);
        return BU(nums1,nums2);
    }
    public int helper(int[] nums1,int[]nums2,int idx1,int idx2,int[][] dp){
        if(idx1 >= nums1.length || idx2 >= nums2.length){
            return 0;
        }
        if(dp[idx1][idx2] != -1){
            return dp[idx1][idx2];
        }
        int ans =0;
        if(nums1[idx1] == nums2[idx2]){
        ans = helper(nums1,nums2,idx1+1,idx2+1,dp)+1;
        
        }else{
            int op1 =helper(nums1,nums2,idx1+1,idx2,dp);
            int op2 =helper(nums1,nums2,idx1,idx2+1,dp);
        ans = Math.max(op1,op2);
        }
        dp[idx1][idx2] = ans;
        return ans;
    }
    public int BU(int[]nums1,int[]nums2){
        int[][] dp = new int[nums1.length+1][nums2.length+1];
        for(int row = nums1.length-1;row>=0;row--){
            for(int col = nums2.length-1;col>=0;col--){
                if(nums1[row] == nums2[col]){
                    dp[row][col] = dp[row+1][col+1]+1;
                }else{
                    int op1 = dp[row+1][col];
                    int op2 = dp[row][col+1];
                    dp[row][col] = Math.max(op1,op2);
                }
                
            }
        }
        return dp[0][0];
    }
}
