package Lec45;
import java.util.*;
public class MinimumFallingPathSum {

	public int minFallingPathSum(int[][] matrix) {
        int ans = 0;
        int min = 10000000;
        int[][] dp = new int[matrix.length][matrix.length];
        for(int[] i:dp)Arrays.fill(i,Integer.MAX_VALUE);
        for(int i=0;i<matrix.length;i++){
            min = Math.min(minFallingPathSumTD(matrix,0,i,dp),min);
        }
        //return min;
        return minFallingPathSumBU(matrix);
    }
    public int minFallingPathSum(int[][] matrix,int sr,int sc){
        if(sc < 0 || sc >= matrix.length||sr>=matrix.length){
            return 10000000;
        }
        if(sr == matrix.length-1){
            return matrix[sr][sc];
        }
        int dir1= minFallingPathSum(matrix,sr+1,sc-1)+matrix[sr][sc];
        int dir2= minFallingPathSum(matrix,sr+1,sc)+matrix[sr][sc];
        int dir3= minFallingPathSum(matrix,sr+1,sc+1)+matrix[sr][sc];
        return Math.min(dir1,Math.min(dir2,dir3));
    }

    public int minFallingPathSumTD(int[][] matrix,int sr,int sc,int[][] dp){
        if(sc < 0 || sc >= matrix.length||sr>=matrix.length){
            return 10000000;
        }
        if(sr == matrix.length-1){
            return matrix[sr][sc];
        }
        if(dp[sr][sc] != Integer.MAX_VALUE){
            return dp[sr][sc];
        }
        int dir1= minFallingPathSumTD(matrix,sr+1,sc-1,dp)+matrix[sr][sc];
        int dir2= minFallingPathSumTD(matrix,sr+1,sc,dp)+matrix[sr][sc];
        int dir3= minFallingPathSumTD(matrix,sr+1,sc+1,dp)+matrix[sr][sc];
        return dp[sr][sc] = Math.min(dir1,Math.min(dir2,dir3));
    }

    public int minFallingPathSumBU(int[][] matrix){

        int[][] dp = new int[matrix.length+1][matrix.length+1];
        
        for(int sr=matrix.length;sr>=0;sr--){
            for(int sc=matrix.length;sc>=0;sc--){
                    if(sc < 0 || sc >= matrix.length||sr>=matrix.length){
                    dp[sr][sc] =  10000000;
                    continue;
                    }
                    if(sr == matrix.length-1){
                    dp[sr][sc] = matrix[sr][sc];
                    continue;
                    }

                    //IMPORTANT CONDITION agar colum -ve hoga to max value return kro iteration skip ni hona
                    //cahiye
                    int dir1= 0;
                    if(sc-1 < 0){
                        dir1 = 10000000;
                    }else{
                        dir1 = dp[sr+1][sc-1]+matrix[sr][sc];
                    }
                    int dir2= dp[sr+1][sc]+matrix[sr][sc];
                    int dir3= dp[sr+1][sc+1]+matrix[sr][sc];
                    dp[sr][sc] = Math.min(dir1,Math.min(dir2,dir3));
            }
        }
         int ans = 10000000;
         for(int i=0;i<dp.length;i++){
           ans=Math.min(ans,dp[0][i]);
        }
        return ans;
    }

}
