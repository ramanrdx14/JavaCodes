package Lec20;

public class Pallindromepartitioning {
    public static void partition(String question,String ans) {
    	if(question.length() == 0) {
    		System.out.println(ans);
    		return;
    	}
    	
    	for(int i=0;i<question.length();i++) {
    		String roq = question.substring(i+1);
    		String component = question.substring(0,i+1);
    		if(checkPallindrome(component)) {  // agar string pallindrome hua tabhi to age ke ans pallindrome bnayenge
    		partition(roq, ans+component+" ");
    		}
    	}
    }
    
    public static boolean checkPallindrome(String str) {
    	int i =0;
    	int j = str.length()-1;
    	while(i <= j) {
    		if(str.charAt(i) != str.charAt(j)) {
    			return false;
    		}
    		i++;
    		j--;
    	}
    	return true;
    }
	public static void main(String[] args) {
		partition("aba", "");

	}

}
