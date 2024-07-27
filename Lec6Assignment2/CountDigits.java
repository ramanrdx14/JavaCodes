package Lec6Assignment2;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int x      = sc.nextInt();
		int temp   = n;
		int count  = 0;
		while(n!=0) {
			int rem = n%10;
			if(rem == x) {
				count ++;
			}
			n = n/10;
		}
		System.out.println(count);
	}

}
