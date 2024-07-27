package Lec15;

public class Palindrome {

	public static void main(String[] args) {
		String s ="abaa";
		int i = 0;
		int j = s.length()-1;
		while(i <= j) {
			if(s.charAt(i)!=s.charAt(j)) {
				System.out.println(false);
				return;
			}
			i++;
			j--;
		}
		System.out.println(true);
	}

}
