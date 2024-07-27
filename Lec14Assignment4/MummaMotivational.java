package Lec14Assignment4;

import java.util.Scanner;

public class MummaMotivational {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int[][] arr= new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int side1Sum = 0;
		int side2Sum = 0;
		int side3Sum = 0;
		int totalTriangleSum = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i > j) { // sum of trinagle
				totalTriangleSum+=arr[i][j];
				}
				if(i > j && j == 0) {
					side1Sum+=arr[i][j];
				}
				if(i > j && i == arr.length-1) {
					side2Sum += arr[i][j];
				}
			}
		}
		side3Sum = totalTriangleSum - (side1Sum+side2Sum);
		System.out.println(side1Sum+".."+side2Sum+".."+side3Sum);
		if(side1Sum+side2Sum > side3Sum) {
			System.out.println("true");
			return;
		}else {
			System.out.println("false");
			return;
		}

	}

}
