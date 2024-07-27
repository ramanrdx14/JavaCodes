package Lec39Assignment9;
import java.util.*;
public class MappedStrings {

	static String[] arr = {"","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P"
			,"Q","R","S","T","U","V","W","X","Y","Z"};
    public static void mappedStrings(String que,String ans) {
    	
    	if(que.length() == 0) {
    		System.out.println(ans);
    		return;
    	}
    	char   ans1 = que.charAt(0);
    	String roq1 = que.substring(1);
    	mappedStrings(roq1, ans+arr[ans1-'0']);
    	
    	if(que.length() >=2) {
    		String ans2 = que.substring(0,2);  
    		int index   = Integer.parseInt(ans2); // converting string to integer
        	String roq2 = que.substring(2);
        	
        	if(index <= 26)
        	mappedStrings(roq2, ans+arr[index]);
    	}
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s   = sc.next();
		mappedStrings(s, "");

	}
}
