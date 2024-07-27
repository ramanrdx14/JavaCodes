package Lec2;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n     = sc.nextInt();
		int rows  = 1;
		int stars = 1;
		int spaces= n-1;
		while(rows <= 2*n-1) {
			int i = 1;
			while(i <= spaces) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while(j <= stars) {
				System.out.print("* ");
				j++;
			}
			if(rows >= n) {
				spaces++;
				stars--;
			}else {
				stars++;
				spaces--;
			}
			rows++;
			System.out.println();
		}
	}

}
