package Lec10Assignment3;
import java.util.*;
public class ArrayBubbleSort {
    public static void bubbleSort(int[] arr) {
    	for(int i=1;i<arr.length;i++) {
    		for(int j=0;j<arr.length-i;j++) {
    			if(arr[j] > arr[j+1]) {
    				int temp = arr[j];
    				arr[j]   = arr[j+1];
    				arr[j+1] = temp;
    			}
    		}
    	}
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int[] arr  = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		bubbleSort(arr);
		for(int i:arr) {
			System.out.println(i);
		}
	}
}
