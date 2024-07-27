package Lec39Assignment9;
import java.util.*;
public class MergeKSortedArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int n = sc.nextInt();
		while(k-->0) {
			for(int i=0;i<n;i++) {
				pq.add(sc.nextInt());
			}
		}
	    while(!pq.isEmpty()) {
	    	System.out.print(pq.poll()+" ");
	    }
	}
}
