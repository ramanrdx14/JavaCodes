package Lec17Assignment5;

import java.util.Scanner;

public class NonRepeatingCharacter {
    public static void nonrepeating(String str) {
    	int[] frequency = new int[256];
    	for(int i=0;i<str.length();i++) {
    		
    		frequency[str.charAt(i) - '\0']  = frequency[str.charAt(i) - '\0']+1;
    	}
    	boolean b = false;
    	for(int i=0;i<str.length();i++) {
    		if(frequency[str.charAt(i) - '\0'] == 1) {
    			b = true;
    			System.out.println(str.charAt(i));
    			break;
    		}
    	}
    	if(b == false) {
    		System.out.println(-1);
    	}
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t      = sc.nextInt();
		while(t --> 0) {
			String s = sc.next();
			nonrepeating(s);
		}
	}

}
