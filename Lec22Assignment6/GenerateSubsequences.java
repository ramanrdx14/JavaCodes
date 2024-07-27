package Lec22Assignment6;

import java.util.Scanner;

public class GenerateSubsequences {
	static int count = 0;
    public static void generateSubequences(String str,String result) {
    	if(str.length() == 0) {
    		System.out.print(result+" ");
    		count++;
    		return;
    	}
    	char ch    = str.charAt(0);
    	String ros = str.substring(1);
    	generateSubequences(ros, result);
    	generateSubequences(ros, result+ch);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s   = sc.next();
		generateSubequences(s, "");
		System.out.println();
		System.out.println(count);
	}

}
