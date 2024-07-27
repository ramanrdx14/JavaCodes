package Lec14Assignment4;

import java.util.Scanner;

public class ColMaximumSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n       = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int maxsum = Integer.MIN_VALUE;
		int maxcol = 0;
		for(int col=0;col<arr.length;col++) {
			int sum = 0;
			for(int row=0;row<arr[0].length;row++) {
				sum+=arr[row][col];
			}
			if(sum > maxsum) {
				maxsum = sum;
				maxcol = col;
			}
		}
		System.out.println(maxcol+1+" "+maxsum);
	}

}
