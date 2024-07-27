package Lec10Assignment3;

import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
    	for(int i=1;i<arr.length;i++) {
    	//InsertlastAt 
    	int pos = i;
    	int j   = pos - 1;
    	int item = arr[pos];
    	while(j >= 0 && arr[j] > item) {
    		  arr[j+1] = arr[j];
    		  j--;
    	}
    	arr[j+1] = item;
    	}
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int[] arr  = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		insertionSort(arr);
		for(int i:arr) {
			System.out.println(i);
		}

	}

}
