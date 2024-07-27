package Lec22Assignment6;
import java.util.*;
import java.util.Scanner;

public class DictionaryOrderLarger {
	static ArrayList<String> al = new ArrayList<>();
    public static void print(String s,String Result) {
    	if(s.length() == 0) {
    		al.add(Result);
    		return ;
    	}
    	for(int i=0;i<s.length();i++) {
    		String ros = s.substring(0,i)+s.substring(i+1);
    		print(ros, Result+s.charAt(i));
    	}
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s   = sc.next();
		print(s,"");
		Collections.sort(al);
		for(int i=al.indexOf(s)+1;i<al.size();i++) {
			System.out.println(al.get(i));
		}

	}

}
