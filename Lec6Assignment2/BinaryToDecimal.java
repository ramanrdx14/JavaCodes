package Lec6Assignment2;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			long n      = sc.nextLong();
			long sum    = 0l;
			long mul    = 1l;
			while(n > 0) {
				long rem = n%10;
			    sum     = sum + rem*mul;
			    mul*=2;
			    n   = n/10;
			}
			System.out.println(sum);
	}

}
