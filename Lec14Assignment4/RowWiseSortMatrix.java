package Lec14Assignment4;

import java.util.Scanner;

public class RowWiseSortMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n       = sc.nextInt();
		int m       = sc.nextInt();
		int[][] arr = new int[n][m];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			IntertionSort(arr[i]);
		}
		
		//Display 
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void IntertionSort(int[] arr) {
		
		for(int i =1;i<arr.length;i++) {
			int pos = i;
			int j   = i-1;
			int temp = arr[pos];
			while(j >= 0 && temp < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}

}
