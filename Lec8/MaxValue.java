package Lec8;

public class MaxValue {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int x     = findMax(arr);
		System.out.println(x);

	}
	public static int findMax(int[] arr) {
		int maxi = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > maxi) {
				maxi = arr[i];
			}
		}
		return maxi;
	}

}
