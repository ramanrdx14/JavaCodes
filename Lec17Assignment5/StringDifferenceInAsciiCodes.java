package Lec17Assignment5;

import java.util.Scanner;

public class StringDifferenceInAsciiCodes {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String  s  = sc.next();
		String temp = "";
		for(int i=1;i<s.length();i++) {
			int ascii1 = s.charAt(i-1);
			int ascii2 = s.charAt(i);
			temp = temp + s.charAt(i-1)+""+(ascii2-ascii1);
		}
		System.out.println(temp+s.charAt(s.length()-1)); // appending last character to ans
	}

}
