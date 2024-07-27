package Lec19;

import java.util.ArrayList;

public class GetSubsequenceAscii {
    public static ArrayList<String> getSubsequnceAscii(String str){
    	if(str.length() == 0) {
    		ArrayList<String> baseresult = new ArrayList<>();
    		baseresult.add("");
    		return baseresult;
    	}
    	ArrayList<String> myresult = new ArrayList<>();
    	char ch                    = str.charAt(0);
    	int ascii                  = ch;
    	ArrayList<String> rr       = getSubsequnceAscii(str.substring(1));
    	for(int i=0;i<rr.size();i++) {
    		myresult.add(rr.get(i));
    		myresult.add(ch+rr.get(i));
    		myresult.add(ascii+rr.get(i));
    		
    	}
    	return myresult;
    }
	public static void main(String[] args) {
		System.out.println(getSubsequnceAscii("ab"));

	}

}
