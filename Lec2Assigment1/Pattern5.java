package Lec2Assigment1;
import java.util.*;
public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int stars  = 1;
		int rows   = 1;
		int spaces = (n/2);
		while(rows <= n) {
			int i =1;
			while(i <= spaces) {
				System.out.print("	");
				i++;
			}
			int j = 1;
			while(j <= stars) {
				System.out.print("*	");
				j++;
			}
			
			if(rows > n/2) {
				stars-=2;
				spaces+=1;
			}else {
				stars+=2;
				spaces--;
			}
			System.out.println();
			rows++;
		}
	}

}
