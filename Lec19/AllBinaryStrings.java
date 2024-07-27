package Lec19;
import java.util.ArrayList;

public class AllBinaryStrings {
    public static ArrayList<String> generate(int n){
    	if(n == 0) {
    		ArrayList<String> br = new ArrayList<>();
    		br.add("");
    		return br;
    	}
    	ArrayList<String> mr = new ArrayList<>();
    	ArrayList<String> rr = generate(n-1);
    	for(String rrbs:rr) {
    		mr.add(rrbs+"0");
    		mr.add(rrbs+"1");
    	}
    	return mr;
    }
	public static void main(String[] args) {
		System.out.println(generate(4));
	}

}
