package Lec22Assignment6;

import java.util.Scanner;

public class ReplaceAllPi {
    public static String replacePi(String s) {
    	if(s.length() <2) {
    		return s;
    	}
    	String temp = "";
    	if(s.charAt(0) == 'p' && s.charAt(1) == 'i') {
    		temp = temp + "3.14"+replacePi(s.substring(2));
    	}else {
    		temp = temp + s.charAt(0) + replacePi(s.substring(1));
    	}
    	return temp;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t      = sc.nextInt();
		while(t -- > 0) {
			String s = sc.next();
			System.out.println(replacePi(s));
		}
	}

}
