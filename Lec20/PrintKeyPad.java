package Lec20;

public class PrintKeyPad {
	static String[] arr = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void print(String question,String ans) {
    	
    	 if(question.length() == 0) {
    		System.out.println(ans);
    		return;
    	  }
    	
    		char current_character = question.charAt(0);
    		String roq = question.substring(1);
    		for(int j=0;j<arr[current_character-'0'].length();j++) {
    			print(roq, ans+arr[current_character-'0'].charAt(j));
    		}
    }
	public static void main(String[] args) {
		print("23","");

	}

}
