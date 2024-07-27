package Lec22Assignment6;

import java.util.Scanner;

public class TOH {
    public static void toh(int n,char source,char destination,char auxilary) {
    	if(n == 0) {
    		return;
    	}
    	toh(n-1, source, auxilary, destination);
    	System.out.println("Moving ring "+ n +" from "+source+" to "+destination);
    	toh(n-1, auxilary, destination, source);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		toh(n,'A','B','C');

	}

}
