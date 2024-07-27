package Lec2;
import java.util.*;
public class Pattern21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int rows   = 1;
		int stars1  = 1;
		int spaces  = 2*n-3;
		int stars2  = 1;
		while(rows <= n) {
			int i = 1;
			while(i <= stars1) {
				System.out.print("* ");
				i++;
			}
			int j = 1;
			while(j <= spaces) {
				System.out.print("  ");
				j++;
			}
			int k = 1;
			if(rows == n)k=2;
			while(k <= stars2) {
				System.out.print("* ");
				k++;
			}
			stars1++;
			stars2++;
			rows++;
			spaces-=2;
			System.out.println();
		}
	}

}
