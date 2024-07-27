package Lec2;
import java.util.*;
public class Pattern10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =    sc.nextInt();
		int rows  = 1;
		int stars = (2*n) - 1;
		int spaces= 0;
		while(rows <= n) {
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
			
			//Next row prep
			stars -=2;
			rows++;
			spaces++;
			System.out.println();
		}

	}

}
