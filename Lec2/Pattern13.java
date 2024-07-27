package Lec2;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n     = sc.nextInt();
		int rows  = 1;
		int stars = 1;
		while(rows <= 2*n-1) {
			int i = 1;
			while(i <= stars) {
				System.out.print("* ");
				i++;
			}
			if(rows >= n) {
				stars--;
			}else {
				stars++;
			}
			rows++;
			System.out.println();
		}
	}
	

}
/*

5
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 

*/