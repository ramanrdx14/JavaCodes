package Lec18;

import java.util.HashMap;

public class Test {
	public static boolean winnerOfGame(String colors) {
        StringBuilder sb = new StringBuilder(colors);
        if(sb.length() <= 2 && sb.equals("AA")){
            return false;
        }else if(sb.length() <= 2 && sb.equals("BB")) {
        	return true;
        }else {
        int count1 = 0;
        int count2 = 0;
        for(int i=1;i<sb.length()-1;i++){
        	System.out.println(sb+"->"+count1+" .. "+count2+"--?"+i);
                if(sb.charAt(i-1) == 'A' && sb.charAt(i+1) == 'A' && sb.charAt(i) == 'A'){
                    sb.deleteCharAt(i);
                    count1++;
                    
                }
                if(sb.charAt(i-1) == 'B' && sb.charAt(i+1) == 'B' && sb.charAt(i) == 'B'){
                    sb.deleteCharAt(i);
                    count2++;
                    
                }
                
          	}
         return count1 > count2;
       }
    }
	public static void main(String[] args) {
		System.out.println(winnerOfGame("BBBAAAABB"));
		System.out.println(winnerOfGame("AAABABB")); 
	}
}
