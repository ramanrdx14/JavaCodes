package Lec22Assignment6;

import java.util.Scanner;

public class GenerateBinaryStrings {
    public static void generate(String s,String result) {
    	if(s.length() == 0) {
    		System.out.print(result+" ");
    		return;
    	}
    	String ros = s.substring(1);
    	if(s.charAt(0) == '?') {
    		generate(ros, result+'0');
    		generate(ros, result+'1');
    	}else {
    	generate(ros, result+s.charAt(0));
    	}
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t      = sc.nextInt();
		while(t-->0) {
		String s   = sc.next();
		generate(s,"");
		}
	}

}
