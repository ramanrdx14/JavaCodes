package Lec22Assignment6;

import java.util.Scanner;

public class GeneratePalanthesis {
    public static void GeneratePalanthesis(int n,int oc,int cc,String result) {
    	
    	if(oc == n && cc == n) {
    		System.out.println(result);
    		return;
    	}
    	if(oc > n || cc > n) {
    		return;
    	}
    	if(cc > oc) {
    		return;
    	}
    	GeneratePalanthesis(n,oc,cc+1,result+")");
    	GeneratePalanthesis(n,oc+1,cc,result+"(");
    	
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		GeneratePalanthesis(n,0,0,"");

	}

}
