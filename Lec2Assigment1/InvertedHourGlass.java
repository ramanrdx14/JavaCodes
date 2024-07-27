package Lec2Assigment1;
import java.util.*;
public class InvertedHourGlass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int rows   = 1;
		int stars  = 1;
		int spaces = 2*n-1;
		while(rows <= 2*n+1) {
			int B = n;
			int i = 1;
			while(i <= stars) {
				System.out.print(B+" ");
				i++;
				B--;
			}
			int j = 1;
			while(j <= spaces) {
				System.out.print("  ");
				j++;
			}
			int k = 1;
			if(rows == n+1) { k=2;
				B++;
			}
			while(k <= stars) {
				System.out.print(++B+" ");
				k++;
			}
			if(rows >n) {
				stars --;
				spaces+=2;
			}else {
				stars++;
				spaces-=2;
				B--;
			}
			rows++;
			System.out.println();
		}
	}

}
