package Lec39Assignment9;
import java.util.*;
public class KthLargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0;i<k;i++) {
			pq.add(arr[i]);
		}
		for(int i=k;i<n;i++) {
			pq.add(arr[i]);
			pq.poll();
		}
		System.out.println(pq.peek());
	}

}
