package Lec14Assignment4;

import java.util.Scanner;

public class SpiralMatrix {
    public static void spiralPrintClockWise(int[][] arr) {
    	int rowStart = 0;
    	int rowEnd   = arr.length-1;
    	int colStart = 0;
    	int colEnd   = arr[0].length-1;
    	int count    = 0;
    	int total    = arr.length*arr[0].length;
    	while(count < total) {
    		for(int i=colStart;i<=colEnd && count < total;i++) {
    			System.out.print(arr[rowStart][i]+" ");
    			count++;
    		}
    		rowStart++;
    		for(int i=rowStart;i<=rowEnd && count < total;i++) {
    			System.out.print(arr[i][colEnd]+" ");
    			count++;
    		}
    		colEnd--;
    		
    		for(int i=colEnd;i>=colStart && count < total;i--) {
    			System.out.print(arr[rowEnd][i]+" ");
    			count++;
    		}
    		rowEnd --;
    		
    		for(int i=rowEnd;i>=rowStart && count < total;i--) {
    			System.out.print(arr[i][colStart]+" ");
    			count++;
    		}
    		colStart++;
    	}
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
		spiralPrintClockWise(arr);
	}

}
