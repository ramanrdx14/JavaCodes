package Lec10Assignment3;
import java.util.*;
public class TappingRainWater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t      = sc.nextInt();
		while(t-->0) {
			int n      = sc.nextInt();
			long[] arr   = new long[n];
			for(int i=0;i<arr.length;i++) {
				arr[i] = sc.nextLong();
			}
			System.out.println(tappingRainWater(arr));
		}
		
	}

	private static long tappingRainWater(long[] arr) {
		long[] left = new long[arr.length];
		long[] right= new long[arr.length];
		left[0] = arr[0];
		right[arr.length-1] = arr[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			left[i] = Math.max(left[i-1],arr[i]);
		}
		for(int j= arr.length-2;j>=0;j--) {
			right[j] = Math.max(right[j+1],arr[j]);
		}
		long sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += Math.min(left[i], right[i])- arr[i];
		}
		return sum;
	}

}
