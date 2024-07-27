package Lec11;

public class BadVersion {
    public static int firstbadVersion(int n) {
    	int lo = 1;
    	int hi = n ;
    	int ans = 0;
    	while(lo <= hi) {
    		int mid = lo+(hi-lo)/2;
    		if(badVersion(mid)) {
    			ans = mid;
    			hi  =mid -1;
    		}else {
    			lo  = mid + 1;
    		}
    	}
    	return ans;
    }
	private static boolean badVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}
	public static void main(String[] args) {
		

	}

}
