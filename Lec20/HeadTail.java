package Lec20;

public class HeadTail {
    public static void print(int n,String ans,int ci) {
    	if(n == ci) {
    		System.out.println(ans);
    		return ;
    	}
    	
    	print(n,ans+"H",ci+1);
    	print(n,ans+"T",ci+1);
    }
	public static void main(String[] args) {
		print(3, "",0);

	}

}
