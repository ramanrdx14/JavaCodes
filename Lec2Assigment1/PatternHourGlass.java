package Lec2Assigment1;
import java.util.*;
public class PatternHourGlass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int rows   = 1;
		int spaces = 0;
		int stars  = 2*n+1;
		int k      = n;
		while(rows <= 2*n+1) {
			int i = 1;
			while(i <= spaces) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			int p = k;
			while(j <= stars) {
				System.out.print(p+" ");
				if(j > (stars/2)) {
					p++;
				}else {
					p--;
				}
				j++;
			}
			if(rows >= n+1) {
				stars+=2;
				spaces--;
				k++;
			}else {
				spaces++;
				stars -=2;
				k--;
			}
			rows ++;
			System.out.println();
		}

	}

}
