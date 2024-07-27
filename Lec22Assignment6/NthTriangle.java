package Lec22Assignment6;
import java.util.*;
public class NthTriangle {


	    public static int nthTriangle(int n){
	        if(n == 0){
	            return 0;
	        }
	        int ans = n + nthTriangle(n-1);
	        return ans;
	         
	    }
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int n      = sc.nextInt();
	        System.out.println(nthTriangle(n));
	}


}
