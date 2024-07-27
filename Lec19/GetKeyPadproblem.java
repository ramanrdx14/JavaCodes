package Lec19;
import java.util.*;
public class GetKeyPadproblem {
	static String[] arr = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static ArrayList<String> getAllConbinations(String number){
    	if(number.length() == 0) {
    		ArrayList<String> baseresult = new ArrayList<>();
    		baseresult.add("");
    		return baseresult;
    	}
        char  ch     = number.charAt(0);
    	String ros   = number.substring(1);
    	ArrayList<String> myresult = new ArrayList<>();
    	ArrayList<String> rr = getAllConbinations(ros);
    	
    		for(int i=0;i<rr.size();i++) {
    			for(int j=0;j<arr[ch-'0'].length();j++) {
    				myresult.add(arr[ch-'0'].charAt(j)+rr.get(i));
    			}
    	}
    	return myresult;
    }
	public static void main(String[] args) {
		System.out.println(getAllConbinations("23"));

	}

}
