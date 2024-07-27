package Lec18;

public class ArrayFirstOccourences {

	public static void main(String[] args) {
		int[] arr = {1,2,3,0,7,3,5,3};
		System.out.println(firstOccr(arr,0,3));
	}

	private static int firstOccr(int[] arr, int si,int x) {
		if(arr.length == si) return -1;
		if(arr[si] == x) {
			return si;
		}
		int rr = firstOccr(arr, si+1, x);
		return rr;
	}

}
