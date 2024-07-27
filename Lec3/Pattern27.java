package Lec3;

import java.util.Scanner;

public class Pattern27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int rows   = 1;
		int stars  = 1;
		int spaces = n-1;
		while(rows <= n) {
			int i = 1;
			while(i <= spaces) {
				System.out.print("	");
					i++;
			}
			int j = 1;
			int k      = 1;
			while(j <= stars) {
				if(j <= (stars/2)) {
					System.out.print(k+"	");  //Generic concept
					k++;
				}else {
					System.out.print(k+ "	"); //tab seperated
					k--;
				}
				j++;
			}
			rows++;
			spaces--;
			stars+=2;
			System.out.println();
		}
	}

}
