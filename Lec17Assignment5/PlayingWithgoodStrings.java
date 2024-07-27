package Lec17Assignment5;
import java.util.*;
public class PlayingWithgoodStrings {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 	   String s   = sc.next();
 	   int maxi   = Integer.MIN_VALUE;
 	   int count  = 0;
 	   for(int i=0;i<s.length();i++){
 		   if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
 			   count ++;
 		   }else{
 			   maxi = Math.max(count,maxi);
 			   count = 0;
 		   }
 	   }
 	   System.out.println(Math.max(maxi,count));
     }

}
