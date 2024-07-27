package Lec6Assignment2;
import java.util.*;
public class OddEvenBack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int     t  = sc.nextInt();
		while(t --> 0) {
			int n = sc.nextInt();
			int evenSum = 0;
			int oddSum  = 0;
			while(n!=0) {
				int rem = n%10;
				if(rem%2 == 0) {
					evenSum +=rem;
				}else {
					oddSum  +=rem;
				}
				n = n /10;
			}
			if(evenSum%4 == 0 || oddSum%3 == 0) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}
		}
	}

}
