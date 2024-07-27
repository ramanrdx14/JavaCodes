package Lec17Assignment5;

import java.util.Scanner;

public class StirngremoveDuplicates {
    public static void removeduplicates(String str) {
    	String temp = ""+str.charAt(0);
    	for(int i=1;i<str.length();i++) {
    		if(str.charAt(i) != str.charAt(i-1)) {
    			temp = temp + str.charAt(i);
    		}
    	}
    	System.out.println(temp);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n   = sc.next();
		removeduplicates(n);

	}

}
