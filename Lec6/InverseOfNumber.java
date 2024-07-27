package Lec6;

import java.util.Scanner;

public class InverseOfNumber {

	public static void main(String[] args) {
		Scanner sc   = new Scanner(System.in);
		long n       = sc.nextLong();
		long pv      = 1l;
		long ans     = 0l;
		while(n > 0) {
			long rem  = n%10;
			ans       +=pv * Math.pow(10, rem-1);
			pv++;
			n = n/10;
		}
		System.out.println(ans);
	}

}
