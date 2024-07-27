package Lec19;

import java.util.ArrayList;

public class GetPermutations {
    public static ArrayList<String> permutaton(String str) {
    	if(str.length() == 0) {
    		ArrayList<String> baseresult = new ArrayList<>();
    		baseresult.add("");
    		return baseresult;
    	}
    	ArrayList<String> myresult = new ArrayList<>();
    	char ch = str.charAt(0);
    	String ros  = str.substring(1);
    	ArrayList<String> rr       = permutaton(ros);
    	for(int i=0;i<rr.size();i++) {
    		for(int j=0;j<=rr.get(i).length();j++) {
    			String ans = rr.get(i);
    			myresult.add(ans.substring(0,j)+ch+ans.substring(j));
    		}
    	}
    	return myresult;
    }
	public static void main(String[] args) {
		
		System.out.println(permutaton("abc"));
	}

}
