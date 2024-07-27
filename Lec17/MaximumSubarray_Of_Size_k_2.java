package Lec17;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumSubarray_Of_Size_k_2 {

	public static void main(String[] args) {
		//Sliding window
		int[] arr = {2,1,3,4,5,6,7,8,9,4,5};
		int  k    = 3;
		int ans   = 0;
		int sum = 0;
		for(int i=0;i<k;i++) {   // pehli window ka size maintain krlenge
			sum+=arr[i];
		}
		ans = sum;
		for(int i=k;i<arr.length;i++) {
			sum +=arr[i];     // window grow
			sum -=arr[i-k];  //  shrik
			ans = Math.max(ans, sum);//ans maintain karenge
		}
		System.out.println(ans);
	}

}
