package Lec44;

public class MazePathDiganol {


	public static int MPD(int cr,int cc,int er,int ec) {


		if(cr == er && cc == ec) {
			return 1;
		}

		if(cr > er || cc > ec) {
			return 0;
		}

		int mph = MPD(cr,cc+1,er,ec);
		int mpv = MPD(cr+1,cc,er,ec);
		int mpd = MPD(cr+1,cc+1,er,ec);

		return mph+mpv+mpd;
	}

	public static int MPDBU(int cr,int cc,int er,int ec,int[][] dp) {


		if(cr == er && cc == ec) {
			return 1;
		}

		if(cr > er || cc > ec) {
			return 0;
		}

		if(dp[cr][cc] != 0) {
			return dp[cr][cc];
		}
		int mph = MPDBU(cr,cc+1,er,ec,dp);
		int mpv = MPDBU(cr+1,cc,er,ec,dp);
		int mpd = MPDBU(cr+1,cc+1,er,ec,dp);

		int ans = mph+mpv+mpd;
		dp[cr][cc] = ans;
		return ans;
	}
	
	public static int MPDTD(int er,int ec) {
		int[][] dp = new int[er+2][ec+2];
		for(int row=er;row>=0;row--) {
			for(int col=ec;col>=0;col--) {
				if(row == er && col == ec) {
					dp[row][col] = 1;
				}else {
					dp[row][col] = dp[row+1][col]+dp[row][col+1]+dp[row+1][col+1];
				}
			}
		}
		return dp[0][0];
	}
	public static void main(String[] args) {
		int n = 12;
		//System.out.println(MPD(0,0,n,n));
		System.out.println(MPDBU(0,0,n,n,new int[n+1][n+1]));
		System.out.println(MPDTD(n,n));
	}

}
