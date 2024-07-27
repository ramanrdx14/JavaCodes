package Lec22Assignment6;

import java.util.Scanner;

public class ConvertStringToInteger {
    public static int convert(String s,int pv) {
    	if(s.length() == 0) {
    		return 0;
    	}
    	int number = 0;
    	number = number + (s.charAt(s.length()-1) - '0') * pv + convert(s.substring(0,s.length()-1), pv*10);
    	return number;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s   = sc.next();
		System.out.println(convert(s, 1));
	}

}
