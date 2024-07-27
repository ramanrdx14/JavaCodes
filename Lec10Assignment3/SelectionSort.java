package Lec10Assignment3;

import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
    	for(int i=0;i<arr.length;i++) {
    		int minIndex = i;
    		for(int j=i;j<arr.length;j++)
    		{
    			if(arr[j] < arr[minIndex]) {
    				minIndex = j;
    			}
    		}
    		int temp = arr[i];
    		arr[i]   = arr[minIndex];
    		arr[minIndex] = temp;
    	}
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int[] arr  = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		selectionSort(arr);
		for(int i:arr) {
			System.out.println(i);
		}

	}

}
