package Lec27;
import java.util.*;
public class NextGreaterElement {
	
	public static void nextGreater(int[] arr) {
		int[] arr1 = new int[arr.length];
		Stack<Integer> s = new Stack<>();
		for(int i=0;i<arr.length;i++) {
			while(!s.isEmpty() && arr[i] > arr[s.peek()]) {
				arr1[s.pop()] = arr[i];
			}
			s.push(i);
		}
		while(!s.isEmpty()) {
			arr1[s.pop()] = -1;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"-->"+arr1[i]);
		}
	}
	public static void main(String[] args) {
		int[] arr = {11,13,21,3};
		nextGreater(arr);
	}
}
