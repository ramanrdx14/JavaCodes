package Lec24Assignment7;
import java.util.*;
public class QueueGame {

	public static void isvalid(int[] arr) {
		Stack<Integer> stack = new Stack<>();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 1) {
				stack.push(arr[i]);
			}else {
				if(stack.isEmpty()) {
					System.out.println("Invalid");
					return;
				}else {
					stack.pop();
				}
			}
		}
		if(stack.isEmpty() || stack.peek() == 1) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t -- > 0) {
			int n = sc.nextInt();
			 int[] arr1 = new int[n];
			 for(int i=0;i<n;i++) {
				  arr1[i] = sc.nextInt();
			 	}
			 	isvalid(arr1);
			}
	  }
}
