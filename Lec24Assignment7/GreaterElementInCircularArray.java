package Lec24Assignment7;
import java.util.*;
public class GreaterElementInCircularArray {

	public static void nextgreater(int[] arr) {
    	int[] ans = new int[arr.length];
    	Stack<Integer> stack = new Stack<>();
    	for(int i=0;i<2*arr.length;i++) {
    		while(!stack.isEmpty() && arr[stack.peek()%arr.length] < arr[i%arr.length]) {
    			ans[stack.pop()%arr.length] = arr[i%arr.length];
    		}
            if(i < arr.length)
    		stack.push(i%arr.length);
    	}
    	while(!stack.isEmpty()) {
    		ans[stack.pop()%arr.length] = -1;
    	}
    	
    	for(int i=0;i<arr.length;i++) {
    		System.out.print(ans[i]+" ");
    	}
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			nextgreater(arr);
	}

}
