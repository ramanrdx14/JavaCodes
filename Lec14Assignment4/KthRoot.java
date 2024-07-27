package Lec14Assignment4;
import java.util.*;
public class KthRoot {
    public static void kthRoot(long N,long k) {
    	long lo = 0l;
    	long hi = N;
    	long ans = 0l;
    	while(lo <= hi) {
    		long mid= (lo+hi)/2l;
    		if(Math.pow(mid, k) == N) {
    			ans = mid;
    			System.out.println(ans);
    			return;
    		}else if(Math.pow(mid, k) > N)
    		{	
    			hi = mid -1;
    		}else {
    			ans = mid;
    			lo = mid + 1;
    		}
    	}
    	System.out.println(ans);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  int t = sc.nextInt();
		
		  while(t-->0) {
			  long N = sc.nextLong();
			  long K = sc.nextLong();
			  kthRoot(N, K);
		  }
	}

}
