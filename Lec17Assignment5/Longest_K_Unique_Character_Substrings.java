package Lec17Assignment5;

import java.util.Scanner;

public class Longest_K_Unique_Character_Substrings {
    public static void print(String s,int k ) {
    	//maintaining the frequency array
    	int[] freq = new int[256];
    	
    	int si = 0;
    	int ei = 0;
    	int uniqueChar = 0;
    	int ans   = -1;
    	while(ei < s.length()) {
    		//growing
    		
    		if(freq[s.charAt(ei)] == 0) {  //agar frequncy 0 hai to wo unique character h
    			uniqueChar ++;
    		}
    		freq[s.charAt(ei)] = freq[s.charAt(ei)] + 1;  //frequency store kro
    		
    		
 
    		//shrinking
    		if(uniqueChar > k) {
    			freq[s.charAt(si)] = freq[s.charAt(si)]-1;
    			if(freq[s.charAt(si)] == 0) {  //agar unique char k value zero hogya to iska mtlb wo character window se hat gya h 
    				uniqueChar --;
    			}
    			si++;
    		}
    		
    		//ans calculate
    		if(uniqueChar == k) {
    		ans = Math.max(ans, ei - si +1);
    		}
    		ei  ++;
    	}
    	System.out.println(ans);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t      = sc.nextInt();
		while(t -- > 0) {
			String s   = sc.next();
			int  k     = sc.nextInt();
			print(s, k);
		}
	}

}
