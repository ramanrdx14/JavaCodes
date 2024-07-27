package Lec11;

public class KthRoot {
    public static int findKthRoot(int N,int k) {
    	int lo  = 0;
    	int hi  = N;
    	int ans = 0;
    	while(lo <= hi) {
    		int mid = (lo+hi)/2;
    		if(Math.pow(mid,k) == N) {
    			return mid;
    		}else if(Math.pow(mid,k) > N) {
    			hi = mid -1;
    		}else {
    			ans = mid;
    			lo  = mid + 1;
    		}
    	}
    	return ans;
    }
	public static void main(String[] args) {
		int N = 143;
		int k = 3;
		System.out.println(findKthRoot(N,k));
	}

}
