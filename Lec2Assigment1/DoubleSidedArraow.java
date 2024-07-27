//Patterns Assignment
package Lec2Assigment1;
import java.util.*;
public class DoubleSidedArraow {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rows = 1;
		int spaces = n-1;
		int spaces2= -1;
		int stars  = 1;
		int z      = 1;
		while(rows <= n) {
			int i = 1;
			while(i <= spaces) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			int p = z;
			while(j <= stars) {
				System.out.print(p+" ");
				j++;
				p--;
			}
			int k = 1;
			while(k <= spaces2) {
				System.out.print("  ");
				k++;
			}
			int l = 1;
			if(rows == 1 || rows == n)l=2;
			while(l <= stars) {
				System.out.print(l+" ");
				l++;
			}
			if(rows > n/2) {
				stars--;
				spaces+=2;
				spaces2-=2;
				z--;
			}else {
				stars++;
				spaces-=2;
				spaces2+=2;
				z++;
			}
			rows++;
			System.out.println();
		}
	}

}
