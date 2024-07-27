package Lec24Assignment7;
import java.util.*;
import java.util.Scanner;

public class StockSpan {
    public static void stockSpan(int[] arr) {
    	Stack<Integer> stack = new Stack<>();
    	for(int i=0;i<arr.length;i++) {
    		while(!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
    			 stack.pop();
    		}
    		if(stack.isEmpty()) {
    			System.out.print(i+1+" ");
    		}else {
    			System.out.print(1+" ");
    		}
    		stack.push(i);
    	}
    	System.out.println("END");
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n     = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		stockSpan(arr);
	}

}
