package Lec44;

public class Mazepath {

	public static int mazepathRec(int cr,int cc,int er,int ec) {
		if(cr == er && cc == ec) {
			return 1;
		}
		if(cr > er || cc > ec) {
			return 0;
		}
		
		int hpw = mazepathRec(cr+1, cc, er, ec);
		int vpw = mazepathRec(cr, cc+1, er, ec);
		return hpw+vpw;
	}
	
	public static int mazepathTD(int cr,int cc,int er,int ec,int[][] dp) {
		if(cr == er && cc == ec) {
			return 1;
		}
		if(cr > er || cc > ec) {
			return 0;
		}
		if(dp[cr][cc] != 0) {
			return dp[cr][cc];
		}
		int hpw = mazepathTD(cr+1, cc, er, ec,dp);
		int vpw = mazepathTD(cr, cc+1, er, ec,dp);
		int ans =  hpw+vpw;
		dp[cr][cc] = ans;
		return ans;
		
	}
	
	public static int mazepathBU(int er,int ec) {
		int[][] dp = new int[er+2][ec+2];
		for(int row=er;row>=0;row--) {
			for(int col=ec;col>=0;col--) {
				if(row == er && col == ec) {
					dp[row][col] = 1;
				}else {
					dp[row][col] = dp[row+1][col] + dp[row][col+1];
				}
			}
		}
		return dp[0][0];
	}
	public static void main(String[] args) {
		int n = 10;
	    //System.out.println(mazepathRec(0, 0, n, n));
		System.out.println(mazepathTD(0,0,n,n,new int[n+1][n+1]));
		System.out.println(mazepathBU(n, n));
	}

}
