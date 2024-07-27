package Lec2;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		 int rows   = 1;
		 int n      = sc.nextInt();
		 int spaces = n-1;
		 int stars  = 1;
		 while(rows <= n) {
			 int i = 1;
			 while(i <= spaces) {
				 System.out.print("  ");
				 i++;
			 }
			 int j = 1;
			 while(j <= stars) {
				 if(j%2==0)
					 System.out.print("  ");
				 else
					 System.out.print("* ");
				 j++;
			 }
			 //next row preparation
			 rows++;
			 stars+=2;
			 spaces--;
			 System.out.println();
		 }
	}

}

/*

n = 5;

        * 
      *   * 
    *   *   * 
  *   *   *   * 
*   *   *   *   * 

*/
