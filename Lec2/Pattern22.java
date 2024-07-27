package Lec2;
import java.util.*;
public class Pattern22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n     = sc.nextInt();
		int rows  = 1;
		int stars = n;
		int spaces= -1;
		while(rows <= n) {
			int i = 1;
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
			if(rows == 1)k=2;
			while(k <= stars) {
				System.out.print("* ");
				k++;
			}
			//next row preparation
			stars--;
			rows++;
			spaces+=2;
			System.out.println();
		}
	}

}

/*

5
* * * * * * * * * 
* * * *   * * * * 
* * *       * * * 
* *           * * 
*               * 

*/