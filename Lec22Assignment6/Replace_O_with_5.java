package Lec22Assignment6;
import java.util.*;
public class Replace_O_with_5 {
    public static int replace(int n,int pv) {
    	if(n == 0) {
    		return 0; 
    	}
    	int number = 0;
    	if(n%10 == 0) {
    		number = number + 5 * pv + replace(n/10, pv*10);
    	}else {
    		number = number + n%10 * pv + replace(n/10, pv*10);
    	}
    	return number;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		if(n == 0) {
			System.out.println(5);
			return;
		}
		System.out.println(replace(n, 1));

	}

}
