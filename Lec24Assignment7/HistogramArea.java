package Lec24Assignment7;
import java.util.*;
public class HistogramArea {
	public static long hist(int[] arr){
		Stack<Integer> stack = new Stack<>();
		int[] left = new int[arr.length];
		for(int i=arr.length-1;i>=0;i--){
			while(!stack.isEmpty() && arr[i] < arr[stack.peek()]){
				left[stack.pop()] = i;
			}
			stack.push(i);
		}
		while(!stack.isEmpty()){
			  left[stack.pop()] = -1;
		}
	    stack.clear();


		int[] right = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			while(!stack.isEmpty() && arr[i] < arr[stack.peek()]){
				right[stack.pop()] = i;
			}
			stack.push(i);
		}
		while(!stack.isEmpty()){
			  right[stack.pop()] = arr.length;
		}
	    stack.clear();
	    long ans = 0;
		for(int i=0;i<arr.length;i++){
			ans = Math.max(ans,arr[i] * (right[i]-left[i]-1));
		}
	    return ans;
        
	}
	public static void main(String[] args) throws Exception {
		int[] arr = {1,2,3,4,5};
		System.out.println(hist(arr));
	}
	
}
