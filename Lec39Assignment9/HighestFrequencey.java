package Lec39Assignment9;
import java.util.*;
public class HighestFrequencey {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		long[] arr  = new long[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		HashMap<Long,Long> hm = new HashMap<>();
		for(int i=0;i<n;i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i])+1);
			}else {
				hm.put(arr[i], 1L);
			}
		}
		long maxkey = 0L;
		long ans    = 0L;
		for(long keys:hm.keySet()) {
			if(hm.get(keys) > ans) {
				maxkey = keys;
				ans    = hm.get(keys);
			}
		}
		System.out.println(maxkey);
	}

}
