package Lec15;

public class StringEquals {
    public static boolean stringEquals(String str1,String str2) {
    	 if(str1 != str2) {
    		 return false;
    	 }
    	 if(str1.length() != str2.length()) {
    		 return false;
    	 }
    	 for(int i=0;i<str1.length();i++) {
    		 if(str1.charAt(i)!=str2.charAt(i)) {
    			 return false;
    		 }
    	 }
    	 return true;
     }
	public static void main(String[] args) {
		String s1 = "raman";
		String s2 = "raman";
		System.out.println("Both the string are Equal :---> "+stringEquals(s1, s2));
	}

}
