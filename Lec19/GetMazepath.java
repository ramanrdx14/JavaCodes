package Lec19;

import java.util.ArrayList;

public class GetMazepath {
    public static ArrayList<String> printmazepath(int cr,int cc,int dr,int dc) {
    	if(cr == dr && cc == dc) {
    		ArrayList<String> baseresult = new ArrayList<>();
    		baseresult.add("");
    		return baseresult;
    	}
    	
    	if(cr > dr || cc > dc) {
    		ArrayList<String> baseresult = new ArrayList<>();
    		return baseresult;
    	}
    	
    	ArrayList<String> myresult = new ArrayList<>();
    	ArrayList<String> rrh = printmazepath(cr, cc+1, dr, dc); // for horizaontal 
    	for(String i:rrh) {
    		myresult.add("H"+i);
    	}
    	ArrayList<String> rrv = printmazepath(cr+1, cc, dr, dc); // for vertical
    	for(String i:rrv) {
    		myresult.add("V"+i);
    	}
    	return myresult;
    	
    }
	public static void main(String[] args) {
		System.out.println(printmazepath(0, 0, 2, 2));

	}

}
