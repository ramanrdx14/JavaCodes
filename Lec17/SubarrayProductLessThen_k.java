package Lec17;

public class SubarrayProductLessThen_k {

	public static void main(String[] args) {
		int[] arr = {10,5,2,6};
		int k  = 100;
		int si = 0;
		int ei = 0;
		int product = 1;
		int count= 0;
		while(ei < arr.length) {
			product *= arr[ei];  // grow
			while(product >= k && si <= ei) {
				product /= arr[si];  //shrink
				si++;
			}
			count  += ei - si+1;  // ans maintain
			ei++;
		}
		System.out.println(count);
	}

}
