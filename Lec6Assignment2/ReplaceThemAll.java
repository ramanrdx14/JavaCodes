package Lec6Assignment2;
import java.util.*;
public class ReplaceThemAll {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n      = sc.nextInt();
		if(n == 0) {
			System.out.println(5);
		}else {
		long mul = 1l;
		long ans = 0l;
		while(n > 0) {
			long rem = n%10;
			if(rem == 0) {
				ans = ans + 5 * mul;
			}else {
				ans = ans + rem * mul;
			}
			mul*=10;
			n = n/10;
		}
		System.out.println(ans);
		}
	}

}
