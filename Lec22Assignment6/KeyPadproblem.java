package Lec22Assignment6;

import java.util.Scanner;

public class KeyPadproblem {
	public static String[] arr = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static int count =0;
	public static void printKeyPads(String question,String ans) {
		if(question.length()<= 0) {
			System.out.print(ans+" ");
			count ++;
			return;
		}
		char ch = question.charAt(0);
		String roq = question.substring(1);
		for(int i=0;i<arr[ch-'0'].length();i++) {
			printKeyPads(roq, ans+arr[ch-'0'].charAt(i));
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s   = sc.next();
		printKeyPads(s,"");
		System.out.println("\n"+count);
	}
}
