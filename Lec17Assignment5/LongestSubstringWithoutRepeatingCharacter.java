package Lec17Assignment5;

import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacter {
	
    public static void findSubtrings(String s) {
    	int si = 0;
    	int ei = 0;
    	int len = 0;
    	int ans = 0;
    	while(ei < s.length()) {
    	//growing
    	len = ei;
    	
    	//shrinking
    	int j = si;
    	while(j < len) {
    		if(s.charAt(j) == s.charAt(len)) {
    			si = j+1;
    		}
    		j++;
    	}
    	
    	//ans maintain
    	  ans = Math.max(ans,ei - si + 1);
    	  ei++;
    	}
    	System.out.println(ans);
    }
  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s   = sc.next();
		findSubtrings(s);
	}

}
