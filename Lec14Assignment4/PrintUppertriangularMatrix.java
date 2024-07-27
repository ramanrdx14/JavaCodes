package Lec14Assignment4;

import java.util.Scanner;

public class PrintUppertriangularMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int[][] arr= new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i == j || i < j) {
					System.out.print(arr[i][j]+" ");
				}else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}

}
