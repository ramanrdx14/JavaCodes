package Lec22Assignment6;

import java.util.Scanner;

public class MazePath {
	static int count = 0;
	public static void mazePath(int sr,int sc,int er,int ec,String result) {
    	if(sr == er && sc == ec) {
    		System.out.print(result+" ");
    		count++;
    		return;
    	}
    	if(sr > er+1 || sc > ec+1) {
    		return;
    	}
    	mazePath(sr+1, sc, er, ec,result+"V");//  horizontly
    	mazePath(sr, sc+1, er, ec,result+"H"); // vertically
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int m      = sc.nextInt();
		mazePath(0, 0, n-1, m-1,"");
		System.out.println("\n"+count);

	}

}
