package Lec17Assignment5;
import java.util.*;
public class CanYouReadThis {
    public static void canyoureadThis(String str) {
    	for(int i=1;i<str.length();i++) {
    		if(str.charAt(i) >=65 &&  str.charAt(i) <= 91) {
    			System.out.println(str.charAt(i-1));
    		}
    		if(str.charAt(i) >=97 &&  str.charAt(i) <= 126) {
    			System.out.print(str.charAt(i-1));
    		}
    	}
    	if(str.charAt(str.length()-1) >=65 &&  str.charAt(str.length()-1) <= 91) {
    		System.out.println(str.charAt(str.length()-1));
    	}
    	if(str.charAt(str.length()-1) >=97 &&  str.charAt(str.length()-1) <= 126) {
    		System.out.print(str.charAt(str.length()-1));
    	}
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s   = sc.next();
		canyoureadThis(s);

	}

}
