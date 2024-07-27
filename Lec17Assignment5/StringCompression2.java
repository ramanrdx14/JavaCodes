package Lec17Assignment5;

import java.util.Scanner;

public class StringCompression2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s   = sc.next();
		print(s);
	}

	private static void print(String s) {
		String temp = "";
		int count   = 1;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				count++;
				
			}else {
			if(count > 1) {
				temp = temp + s.charAt(i)+count;
				count=1;
			}else {
				temp = temp + s.charAt(i);
				count =1;
			}
		 }
	}
		if(count > 1)
			temp = temp + s.charAt(s.length()-1)+count;
		else
			temp = temp + s.charAt(s.length()-1);
		System.out.println(temp);
	}

}
