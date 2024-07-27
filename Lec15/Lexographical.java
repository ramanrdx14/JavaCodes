package Lec15;

public class Lexographical {
    public static int compareTo(String str1,String str2) {
    	if(str1 == str2) {
    		return 0;
    	}
    	for(int i=0;i<Math.min(str1.length(), str2.length());i++) {
    		if(str1.charAt(i) != str2.charAt(i)) {
    			return str1.charAt(i) - str2.charAt(i);
    		}
    		
    	}    	
    	return str1.length() - str2.length();
    }
	public static void main(String[] args) {
		
		
		String str1 = "rajesh";
		String str2 = "raj";
		
		// 0   s1 == s2
		// +ve s1 > s2
		// -ve s1 < s2
		System.out.println(compareTo(str1,str2));
	}

}
