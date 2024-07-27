package Lec6Assignment2;

import java.util.Scanner;

public class NthFibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n     = sc.nextLong();
		long  a     = 0l;
		long  b     = 1l;
		while(n -- > 0) {
			 long c = a+b;
			 a = b;
			 b = c;
		}
		System.out.println(a);

	}

}
