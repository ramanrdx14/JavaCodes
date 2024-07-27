package Lec10Assignment3;
import java.util.*;
public class PairOfRoses {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t      = sc.nextInt();
		while(t -- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<arr.length;i++) {
				arr[i] = sc.nextInt();
			}
			int target = sc.nextInt();
			pairOfRoses(arr,target);
		}
	}

	private static void pairOfRoses(int[] arr,int target) {
		Arrays.sort(arr);
		int lo = 0;
		int hi = arr.length-1;
		int[] minPair = new int[2];
		int min       = Integer.MAX_VALUE;
		while(lo < hi) {
			if(arr[lo]+arr[hi] == target) {
				if((arr[hi]-arr[lo]) < min) {
					minPair[0] = arr[lo];
					minPair[1] = arr[hi];
					min = arr[hi]-arr[lo];
				 }
				hi--;
				lo++;
			}else if(arr[lo]+arr[hi] > target) {
				hi --;
			}else {
				lo ++;
			}
		}
		System.out.println("Deepak should buy roses whose prices are "+minPair[0]+" and "+minPair[1]+".");
	}

}
