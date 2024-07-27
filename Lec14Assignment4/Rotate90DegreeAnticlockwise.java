package Lec14Assignment4;

import java.util.Scanner;

public class Rotate90DegreeAnticlockwise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n       = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		rotate(arr);
	}

	private static void rotate(int[][] arr) {
		
		//transpose 
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp = arr[i][j];
				arr[i][j]= arr[j][i];
				arr[j][i]= temp;
			}
		}
		//swap column wise element
		for(int col=0;col<arr.length;col++) {
			
			//Just reverse array code
			int i = 0;
			int j = arr.length-1;
			while(i <= j) {
				   int temp = arr[i][col];
				arr[i][col] = arr[j][col];
				arr[j][col] = temp;
				i++;
				j--;
			}
		}
		
		//Display
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
