package Lec2Assigment1;

import java.util.Scanner;

public class PatternMountain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int rows   = 1;
		int spaces = 2*n-3;
		int stars  = 1;
		while(rows <= n) {
			int i = 1;
			int z      = 1;
			while(i <= stars) {
				System.out.print(z+" ");
				i++;
				z++;
			}
			int j = 1;
			while(j <= spaces) {
				System.out.print("  ");
				j++;
			}
			int k = 1;
			if(rows == n) { k = 2;
			z = z-1;
			}
			while(k <= stars) {
				--z;
				System.out.print(z+" ");
				k++;
			}
			rows ++;
			stars++;
			spaces-=2;
			System.out.println();
		}

	}

}
