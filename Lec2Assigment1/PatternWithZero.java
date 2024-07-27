package Lec2Assigment1;
import java.util.*;
public class PatternWithZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int rows   = 1;
		int stars  = 1;
		while(rows <= n) {
			int i = 1;
			while(i <= stars) {
				if(i == 1 || i == rows) {
					System.out.print(rows+"	");
				}else {
					System.out.print(0+"	");
				}
				i++;
			}
			rows++;
			stars++;
			System.out.println();
		}

	}

}
