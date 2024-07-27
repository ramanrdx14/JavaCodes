package Lec2Assigment1;

import java.util.Scanner;

public class PatternTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int rows   = 1;
		int stars  = 1;
		int spaces = n-1;
		int k      = 1;
		while(rows <= n) {
			int i = 1;
			while(i <= spaces) {
				System.out.print("	");
					i++;
			}
			int j = 1;
			while(j <= stars) {
				if(rows!= 1 &&  j > rows) {
					k--;
					System.out.print(k-1+ "	");
				}else {
				System.out.print(k+ "	"); //tab seperated
				k++;
				}
				j++;
			}
			rows++;
			spaces--;
			stars+=2;
			System.out.println();
		}

	}
}