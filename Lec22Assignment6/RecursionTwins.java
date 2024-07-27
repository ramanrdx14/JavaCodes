package Lec22Assignment6;

import java.util.Scanner;

public class RecursionTwins {
    public static int twins(String s) {
    	if(s.length() <= 2) {
    		return 0;
    	}
    	String ros = s.substring(1);
    	int count  = 0;
    	if(s.charAt(0) == s.charAt(2)) {
    		count = count + 1;
    	}
    	count = count + twins(ros);
    	return count;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n      = sc.next();
		System.out.println(twins(n.toLowerCase()));
	}

}
