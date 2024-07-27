package Lec14Assignment4;

import java.util.Scanner;

public class BooleanMatrix {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m      = sc.nextInt();
		int n      = sc.nextInt();
		int[][] matrix = new int[m][n];
		int[][] temp   = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		// check weather the ith row || ith col has 1 or not
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(matrix[i][j] == 1) {
					convertMatrix(i,j,temp);
				}
			}
		}
		
		//Print temp matrix
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(temp[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static void convertMatrix(int row, int col, int[][] temp) {
		// for row right
		for(int i = col ;i< temp[0].length;i++) {
			temp[row][i] = 1;
		}
		// for row left direction
		for(int i=col;i>=0;i--) {
			temp[row][i] = 1;
		}
		
		// for col  lower
		for(int i=row;i<temp.length;i++) {
			temp[i][col]  = 1;
		}
		
		// for col upper
		for(int i=row;i>=0;i--) {
			temp[i][col]  = 1;
		}
	}

}
