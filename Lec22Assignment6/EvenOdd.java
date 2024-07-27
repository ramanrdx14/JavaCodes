package Lec22Assignment6;

import java.util.Scanner;

public class EvenOdd {
    public static void evenOdd(int n) {
    	if(n == 0) {
    		return;
    	}
    	if(n%2 != 0) {
    		System.out.println(n);
    	}
    	evenOdd(n-1);
    	if(n%2 == 0) {
    		System.out.println(n);
    	}
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		evenOdd(n);
	}

}
