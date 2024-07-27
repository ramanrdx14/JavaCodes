package Lec16;

public class SubstringWithLength {
    public static void substringWithLen(String s) {
    	for(int length=1;length<=s.length();length++) {  //pehla loop length tak
    		for(int j=length;j<=s.length();j++) { // dusra loop length se suru ho raha h aur str.lengthtak jaiga
    			int i = j-length;                //  i = j - length
    			System.out.println(s.substring(i,j));
    		}
    	}
    }
	public static void main(String[] args) {
		
	}

}
