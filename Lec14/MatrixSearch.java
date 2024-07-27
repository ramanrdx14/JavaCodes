package Lec14;

import java.util.Scanner;

public class MatrixSearch {
    public static int matrixSearch(int[][] arr,int x) {
    	//stair case search
    	int row = 0;
    	int col = arr[0].length-1;
    	while(row <= arr.length-1 && col >= 0) {
    		if(arr[row][col] == x) {
    			return 1;
    		}else if(x > arr[row][col]) {
    			row++;
    		}else {
    			col--;
    		}
    	}
    	return 0;
    }
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
		int x = sc.nextInt();
		System.out.println(matrixSearch(arr,x));
	}

}
