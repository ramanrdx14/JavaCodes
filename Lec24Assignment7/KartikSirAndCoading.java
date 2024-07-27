package Lec24Assignment7;
import java.util.*;
import java.util.Scanner;

public class KartikSirAndCoading {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		int q      = sc.nextInt();
		while(q -- > 0) {
			int opr = sc.nextInt();
			if(opr == 2) {
				stack.push(sc.nextInt());
			}else {
				if(stack.isEmpty()) {
					System.out.println("No Code");
				}else {
					System.out.println(stack.pop());
				}
			}
		}

	}

}
