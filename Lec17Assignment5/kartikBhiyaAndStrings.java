package Lec17Assignment5;

import java.util.Scanner;

public class kartikBhiyaAndStrings {
    public static int flip(String s,char ch,int k) {
    	int si = 0;
    	int ei = 0;
    	int ans= 0;
    	int flip = 0;
    	while(ei < s.length()) {
    		if(s.charAt(ei) == ch) {  // growing
    			flip++;
    		}
    		while(flip > k && si <= ei) {  // shrinking
    			
    			//agar chini ki boori mai mirchi hai to nikalo  aur next bora mai jao
    			if(s.charAt(si) == ch) {
    			flip --;
    			}
    			//nahi bhi hai mirchi to next bora mai check kro
    			si++;
    		}
    		ans = Math.max(ans, ei-si+1);  // ans maintain
    		ei++;
    	}
    	return ans;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k      = sc.nextInt();
		String s   = sc.next();
		int a      = flip(s, 'a',k);
		int b      = flip(s, 'b',k);
		System.out.println(Math.max(a, b));
	}

}
