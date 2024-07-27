package Lec6Assignment2;
import java.util.*;
public class ChewbaccaandNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long newNo = 0l;
		long mul    = 1l;
		while(n > 0) {
			long rem = n%10;
			if(rem >= 5) {
				if(rem == 9 && n/10 == 0) {
					
				}else {
					rem = 9 - rem;
				}
			}
			newNo = newNo+rem*mul;
			mul*=10;
			n = n/10;
		}
		System.out.println(newNo);
	}

}
