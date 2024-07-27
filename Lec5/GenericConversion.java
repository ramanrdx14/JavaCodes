package Lec5;

import java.util.Scanner;

public class GenericConversion {
    public static int converter(int base,int number) {
    	int n = number;
    	int mul = 1;
    	int finalNumber  = 0;
    	while(n > 0) {
    		int rem = n % 10;
    		finalNumber = finalNumber + rem*mul;
    		mul  *=base;
    		n = n/10;
    	}
    	return finalNumber;
    }
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int b       = sc.nextInt();
		int bc      = sc.nextInt();
		int n       = sc.nextInt();
		n           = converter(b,n);
		int mul    = 1;
		int sum    = 0;
		while(n > 0) {
			int rem = n % bc;
			sum = sum + rem *mul;
			mul*=10;
			n   = n/bc;
		}
		System.out.println(sum);
	 }

}

