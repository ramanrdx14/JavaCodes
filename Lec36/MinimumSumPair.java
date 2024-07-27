package Lec36;
import java.util.*;
public class MinimumSumPair {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int[] arr = {1, 2, 3, 4};
		for(int i=0;i<arr.length;i++) {
			pq.add(arr[i]);
		}
		int sum =0;
		while(pq.size() > 1) {
			int no1 = pq.poll();
			int no2 = pq.poll();
			sum +=no1+no2;
			pq.add(no1+no2);
		}
		System.out.println(sum);
	}

}
