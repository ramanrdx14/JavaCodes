package Lec17Assignment5;

import java.util.Scanner;

public class StringOddEvenCharacter {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s   = sc.next();
		String ans = "";
		for(int i=0;i<s.length();i++) {
			if(i%2 == 0) {
				ans = ans + (char)(s.charAt(i)+1);
						
			}else {
				ans = ans + (char)(s.charAt(i)-1);
			}
		}
		System.out.println(ans);
	}

}
