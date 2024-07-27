package Lec24Assignment7;
import java.util.Stack;
import java.util.Scanner;

public class NextGreaterElement {
    public static void nextgreater(int[] arr) {
    	int[] ans = new int[arr.length];
    	Stack<Integer> stack = new Stack<>();
    	for(int i=0;i<arr.length;i++) {
    		while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
    			ans[stack.pop()] = arr[i];
    		}
    		stack.push(i);
    	}
    	while(!stack.isEmpty()) {
    		ans[stack.pop()] = -1;
    	}
    	
    	for(int i=0;i<arr.length;i++) {
    		System.out.println(arr[i]+","+ans[i]);
    	}
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t      = sc.nextInt();
		while(t -- > 0)
		{
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			nextgreater(arr);
		}
	}
}
