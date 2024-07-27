package Lec15;

public class Substring {

	public static void main(String[] args) {
		int count = 0;
		String s = "raman";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				++count;
				System.out.println(s.substring(i,j));
			}
		}
		System.out.println(count);
	}

}
