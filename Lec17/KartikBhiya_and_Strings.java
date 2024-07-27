package Lec17;

import java.util.Scanner;

public class KartikBhiya_and_Strings {
	public static int kartikBhiyaStirngs(String s,int k,char ch) {
		int si = 0;
		int ei = 0;
		int flipcount = 0;
		int ans       = 0;
		while(ei < s.length()) {
			if(s.charAt(ei) == ch) {
				flipcount ++;
			}
			
			while(flipcount > k ) {
				if(s.charAt(si) == ch) {
					flipcount --;
				}
				si++;
			}
			ans = Math.max(ans, ei - si +1);
			ei ++;
		}
		return ans;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		String s   = sc.next();
		int ans1 = kartikBhiyaStirngs(s, n,'a');
		int ans2 =  kartikBhiyaStirngs(s,n,'b');
		System.out.println(Math.max(ans1, ans2));
	}

}
