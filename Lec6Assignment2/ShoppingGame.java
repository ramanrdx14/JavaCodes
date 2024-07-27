package Lec6Assignment2;
import java.util.*;
public class ShoppingGame {

	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int t      = sc.nextInt();
	        while(t -- > 0){
	            int M  = sc.nextInt();
	            int N  = sc.nextInt();
	            long Acount = 0l;
	            long Hcount = 0l;
	            int i       = 1;
	            while(true){
	                if(i%2!=0) {
	                	if(Acount <= M) {
	                		Acount+=i;
	                	}else {
	                		System.out.println("Harshit");
	                		break;
	                	}
	                }else {
	                	if(Hcount <= N) {
	                		Hcount+=i;
	                	}else {
	                		System.out.println("Aayush");
	                		break;
	                	}
	                }
	                i++;
	            }
	        }
	    }
	}