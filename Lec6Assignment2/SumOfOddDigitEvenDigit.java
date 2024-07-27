//Number system Assignment
package Lec6Assignment2;
import java.util.*;
public class SumOfOddDigitEvenDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int pos    = 1;
		int oddSum = 0;
		int evenSum= 0;
		while(n > 0) {
			int rem = n%10;
			if(pos%2 == 0) {
				evenSum +=rem;
			}else {
				oddSum  +=rem;
			}
			n = n/10;
			pos++;
		}
		System.out.println(oddSum);
		System.out.println(evenSum);
	}

}
