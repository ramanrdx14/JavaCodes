package Lec2;

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int rows   = 1;
		int stars  = n/2;
		int spaces  = 1;
		while(rows <= n) {
			int i= 1;
			while(i <= stars) {
				System.out.print("* ");
				i++;
			}
			int j = 1;
			while(j <= spaces) {
				System.out.print("  ");
				j++;
			}
			int k = 1;
			while(k <= stars) {
				System.out.print("* ");
				k++;
			}
			if(rows < (n/2)+1) {
				stars--;
				spaces+=2;
			}else {
				stars++;
				spaces-=2;
			}
			rows++;
			System.out.println();
		}
	}

}

/*

* * *   * * * 
* *       * * 
*           * 
              
*           * 
* *       * * 
* * *   * * *
*/