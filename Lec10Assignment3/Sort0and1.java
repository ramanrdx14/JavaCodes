package Lec10Assignment3;

import java.util.Scanner;

public class Sort0and1 {
    public static void sort(int[] arr) {
    	int k = 0;
    	int i = 0;
    	while(i < arr.length) {
    		if(arr[i] == 0) {
    			int temp = arr[i];
    			arr[i]   = arr[k];
    			arr[k]   = temp;
    			k++;
    			i++;
    		}else {
    			i++;
    		}
    	}
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int[] arr  = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		sort(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}
