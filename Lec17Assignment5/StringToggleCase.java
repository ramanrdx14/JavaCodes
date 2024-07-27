package Lec17Assignment5;
import java.util.*;
public class StringToggleCase {
    public static void StringToggleCase(String s) {
    	String temp = "";
    	for(int i=0;i<s.length();i++) {
    		if(s.charAt(i) >=65 && s.charAt(i) <= 91) {
    			temp = temp + (""+s.charAt(i)).toLowerCase();
    		}else {
    			temp = temp + (""+s.charAt(i)).toUpperCase();
    		}
    	}
    	System.out.println(temp);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringToggleCase(s);
	}

}
