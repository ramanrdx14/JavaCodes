package Lec20;

public class PrintPermutations {
    public static void permutations(String que,String ans) {
    	if(que.length() == 0) {
    		System.out.println(ans);
    		return;
    	}
    	for(int i=0;i<que.length();i++) {
    		char   cc  = que.charAt(i);
    		String ros = que.substring(0,i)+que.substring(i+1);
    		permutations(ros, ans+cc);
    	}
    }
	public static void main(String[] args) {
		permutations("abc", "");

	}

}
