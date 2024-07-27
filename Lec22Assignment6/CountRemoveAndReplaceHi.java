package Lec22Assignment6;

import java.util.Scanner;

public class CountRemoveAndReplaceHi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s   = sc.next();
		System.out.println(count(s));
		System.out.println(remove(s));
		System.out.println(replace(s));

	}

	private static String replace(String s) {
		if(s.length() <2) {
    		return s;
    	}
    	String temp = "";
    	if(s.charAt(0) == 'h' && s.charAt(1) == 'i') {
    		temp = temp + "bye"+replace(s.substring(2));
    	}else {
    		temp = temp + s.charAt(0) + replace(s.substring(1));
    	}
    	return temp;
	}

	private static String remove(String s) {
		if(s.length() <2) {
    		return s;
    	}
    	String temp = "";
    	if(s.charAt(0) == 'h' && s.charAt(1) == 'i') {
    		temp = temp + remove(s.substring(2));
    	}else {
    		temp = temp + s.charAt(0) + remove(s.substring(1));
    	}
    	return temp;
	}

	private static int count(String s ) {
		if(s.length() < 2) {
			return 0;
		}
		int total = 0;
		if(s.charAt(0) == 'h' && s.charAt(1) == 'i') {
			total ++;
			total = total + count(s.substring(2));
		}else {
			total = total + count(s.substring(1));
		}
		return total;
	}

}
