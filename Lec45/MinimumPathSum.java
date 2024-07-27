package Lec45;

public class MinimumPathSum {

	public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        //return minPathSumTD(grid,0,0,dp);
       return  minPathSumBU(grid);
    }
    public int minPathSumTD(int[][] grid,int sr,int sc,int[][] dp) {
        if(sr == grid.length-1 && sc == grid[0].length-1){
            return grid[sr][sc];
        }
        if(sr >= grid.length || sc >=grid[0].length){
            return 10000000;
        }
        if(dp[sr][sc] != 0)return dp[sr][sc];
        int downdir = minPathSumTD(grid,sr+1,sc,dp)+grid[sr][sc];
        int rightdir= minPathSumTD(grid,sr,sc+1,dp)+grid[sr][sc];

        return dp[sr][sc] = Math.min(downdir,rightdir);
    }

    //DP Bottom UP Tabulation
    public int minPathSumBU(int[][] grid) { 
        int[][] dp = new int[grid.length+1][grid[0].length+1];
        for(int sr=grid.length;sr>=0;sr--){
            for(int sc=grid[0].length;sc>=0;sc--){

                //BASE CONDITION
                if(sr == grid.length-1 && sc == grid[0].length-1){
                dp[sr][sc] =  grid[sr][sc];
                continue;
                }
                if(sr >= grid.length || sc >=grid[0].length){
                dp[sr][sc] =  10000000;
                continue;
                }

                int downdir = dp[sr+1][sc]+grid[sr][sc];
                int rightdir= dp[sr][sc+1]+grid[sr][sc];

                 dp[sr][sc] = Math.min(downdir,rightdir);
            }
        }
        return dp[0][0];
    }

}
