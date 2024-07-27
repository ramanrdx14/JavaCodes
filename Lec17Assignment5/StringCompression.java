package Lec17Assignment5;

import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s   = sc.next();
		String temp= "";
		int i = 0;
		int count =  1;
		while(i < s.length()-1) {
			if(s.charAt(i) == s.charAt(i+1)) {
				count ++;
			}else {
				if(count >= 1) {
					temp = temp + s.charAt(i)+count;
					count = 1;
				}
			}
			i++;
		}
		
		temp = temp + s.charAt(i)+count;
		System.out.println(temp);
	}

}
