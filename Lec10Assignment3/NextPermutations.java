package Lec10Assignment3;

import java.util.Scanner;

public class NextPermutations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t      = sc.nextInt();
		while(t-->0) {
		int n      = sc.nextInt();
		int[] arr  = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		  }
		nextPermutation(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		  }
	   }
	}
	public static void nextPermutation(int[] arr) {
		//Find the dip index 
		int dipindex = -1;
		int i        = arr.length - 2;
		while(i >=0) {
			if(arr[i] < arr[i+1]) {
				dipindex = i;
				break;
			}
			i--;
		}
		System.out.println(dipindex);
		if(dipindex == -1) {
		//Edge Case : If dip index == -1 reverse the array
		for(int k=0,j=arr.length-1;k<j;k++,j--) {
			int temp = arr[k];
			arr[k]   = arr[j];
			arr[j]   = temp;
		  }
		return ;
		}
		//Finding the next greter element (closest) to arr[dipindex]
		for(int j=arr.length-1;j>dipindex;j--) {
			if(arr[j] > arr[dipindex]) {
				int temp = arr[dipindex];
				arr[dipindex] = arr[j];
				arr[j]         = temp;
				break;
			}
		}
	   
		//Sorting the array from the dip-index + 1  to N ;
		//reverse the array to sort
		for(int k=dipindex+1,j=arr.length-1;k<=j;k++,j--) {
			int temp = arr[k];
			arr[k]   = arr[j];
			arr[j]   = temp;
		}
	}

}
