package Lec6Assignment2;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long lcm           = 0l;
		long divident      = sc.nextLong();
		long divisor       = sc.nextLong();
		long product       = divident*divisor;
		while(divident%divisor!=0) {
			long rem = divident%divisor;
			divident= divisor;
			divisor = rem;
		}
		lcm   = product/divisor;
		System.out.println(lcm);
	}

}
