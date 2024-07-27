package Lec20;

public class printSubsequences {
	public static void print(String str,String res) {
		if(str.length() == 0) {
			System.out.println(res);
			return;
		}
		char currentCharcter = str.charAt(0);
		String ros = str.substring(1);
		print(ros, res+currentCharcter); // include in answer
		print(ros, res); // not include in answer
	}
	public static void main(String[] args) {
		print("abc", "");
	}
}
