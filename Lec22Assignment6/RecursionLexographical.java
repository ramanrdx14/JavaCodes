package Lec22Assignment6;

import java.util.Scanner;

public class RecursionLexographical {
    public static void lexoPrint(int n,int result) {
    	if(result > n) {
    		return;
    	}
    	System.out.print(result+" ");
    	int i = 0;
    	if(result == 0) {
    		i = 1;
    	}
    	for(;i<=9;i++) {
    		lexoPrint(n, result*10+i);
    	}
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		lexoPrint(n, 0);
	}

}
