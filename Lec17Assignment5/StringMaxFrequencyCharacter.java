package Lec17Assignment5;

import java.util.Scanner;

public class StringMaxFrequencyCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s   = sc.next();
		int[] freq = new int[256];
		for(int i=0;i<s.length();i++) {
			freq[s.charAt(i) - '\0'] = freq[s.charAt(i) - '\0']+1;
		}
		int maxi = Integer.MIN_VALUE;
		int maxiIndex = -1;
		for(int i=0;i<256;i++) {
			if(freq[i] > maxi) {
				maxi = freq[i];
				maxiIndex = i;
			}
		}
		System.out.println((char)maxiIndex);
	}

}
