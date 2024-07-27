package Lec14Assignment4;

import java.util.Scanner;

public class PiyushAndMagicalPark {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int m      = sc.nextInt();
		int k      = sc.nextInt();
		int s      = sc.nextInt();
		char[][] arr = new char[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j] = sc.next().charAt(0);
			}
		}
		canReachHomeOrNot(arr,k,s);
		
	}

	private static void canReachHomeOrNot(char[][] arr, int k, int s) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(s < k) {
					System.out.println("No");
					return;
				}
				if(arr[i][j] == '.') {
					if(j != arr[0].length-1) {  // for jumping from last row 
					s -=2;
					s -=1;  // strength decrese by 1 in every step 
					}else {
						s -=2;
					}
				}else if(arr[i][j] == '*') {
					if(j != arr[0].length-1) {
						s +=5;
						s -=1;
						}else {
							s +=5;
						}
				}else {
					break;
				}
			}
		}
		if(s < k)
		{
			System.out.println("No");
		}else {
			System.out.println("Yes");
			System.out.println(s);
		}
	}

}
