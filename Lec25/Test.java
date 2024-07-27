package Lec25;
import java.util.*;
public class Test {
	static int min = Integer.MAX_VALUE;
	public static void min(int[]arr,int si,int idx,int res) {
		if(si == arr.length) {
			System.out.print(res+" ");
			min = Math.min(min, res);
			return;
		}
		if(si > arr.length) {
			return;
		}
		min(arr, si+2, idx, res+arr[si]);
		min(arr, si+1, idx, res+arr[si]);
	}
	public static void main(String[] args) {
		int[] arr = {27,17,29,45,3,39,42,26};
		min(arr, 0, 0, 0);
		System.out.println("--"+min);
		
	}
}
