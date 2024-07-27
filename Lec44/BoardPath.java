package Lec44;

public class BoardPath {

	public static int BPRecursion(int curr,int end) {
		if(curr == end) {
			return 1;
		}
		if(curr > end) {
			return 0;
		}
		int total = 0;
		for(int i=1;i<=6;i++) {
			total = total + BPRecursion(curr+i, end);
		}
		return total;
	}
	
	
	
	
	public static int BPRecursionTD(int curr,int end,int[] strg) {
		if(curr == end) {
			return 1;
		}
		if(curr > end) {
			return 0;
		}
		if(strg[curr] != 0) {
			return strg[curr];  //reuse
		}
		int total = 0;
		for(int i=1;i<=6;i++) {
			total = total + BPRecursionTD(curr+i, end,strg);
		}
		strg[curr] = total;  //store
		return total;
	}
	
	
	public static int BPBU(int n) {
		int[] strg = new int[n+6];
		strg[n]    = 1;
		for(int i=n-1;i>=0;i--) {
			strg[i] = strg[i+1]+strg[i+2]+strg[i+3]+strg[i+4]+strg[i+5]+strg[i+6];
		}
		return strg[0];
	}
	
	
	
	public static int BPBUSE(int n) { //space efficient
		int[] strg = new int[6];
		strg[0]    = 1;
		for(int i=n;i>=1;i--) {
			int sum = strg[0]+strg[1]+strg[2]+strg[3]+strg[4]+strg[5];
			
			strg[5] = strg[4];
			strg[4] = strg[3];
			strg[3] = strg[2];
			strg[2] = strg[1];
			strg[1] = strg[0];
			strg[0] = sum;
		}
		return strg[0];
	}
	public static void main(String[] args) {
		int n = 10;
		System.out.println(BPRecursion(0,n));
		System.out.println(BPRecursionTD(0,n,new int[n]));
		System.out.println(BPBU(n));
		System.out.println(BPBUSE(n));
	}

}
