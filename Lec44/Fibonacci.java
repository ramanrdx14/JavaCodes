package Lec44;

public class Fibonacci {

	public static int fiboRecursion(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		
		int fnm1 = fiboRecursion(n-1);
		int fnm2 = fiboRecursion(n-2);
		
		int fn   = fnm1 + fnm2;
		return fn;
	}
	
	public static int fiboTD(int n,int[] strg) {
		if(n == 0 || n == 1) {
			return n;
		}
		
		if(strg[n] != 0) {   // reuse the value
			return strg[n];
		}
		
		int fnm1 = fiboTD(n-1,strg);
		int fnm2 = fiboTD(n-2,strg);
		
		
		int fn   = fnm1 + fnm2;
		
		strg[n]  = fn;   // store the value
		return fn;
	}
	
	public static int fiboBU(int n) {
		
		//size of array n+!
		int[] dp = new int[n+1];
		
		//base case value fill
		dp[0]    = 0;
		dp[1]    = 1;
		
		
		for(int i=2;i<=n;i++) {
			dp[i] = dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
	
	
	public static int fiboSpaceEfficientBU(int n) {  // Tc - O(n)   Sc - O(1)
		int[] dp = new int[2];
		dp[0]    = 0;
		dp[1]    = 1;
		
		for(int i=0;i<n-1;i++) {
			int sum = dp[0]+dp[1];
			dp[0]   = dp[1];
			dp[1]   = sum;
		}
		return dp[1];
	}
	public static void main(String[] args) {
		int n = 7;
		//System.out.println(fiboRecursion(n));
		//System.out.println(fiboTD(n,new int[n+1]));
		//System.out.println(fiboBU(7));
		
		System.out.println(fiboSpaceEfficientBU(n));
	}

}
