package Lec19;

import java.util.ArrayList;

public class Subsequence {
    public static ArrayList<String> getSubsequence(String str){
    	if(str.length() == 0) {
    		ArrayList<String> baseresult = new ArrayList<>();
    		baseresult.add("");
    		return baseresult;
    	}
    	ArrayList<String> myresult = new ArrayList<>();
    	char ch                    = str.charAt(0);
    	ArrayList<String> rr       = getSubsequence(str.substring(1));
    	for(int i=0;i<rr.size();i++) {
    		myresult.add(rr.get(i));
    		myresult.add(ch+rr.get(i));
    	}
    	return myresult;
    }
	public static void main(String[] args) {
		System.out.println(getSubsequence("abc"));
	}

}
