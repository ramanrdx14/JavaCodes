package Template;
import java.util.*;
public class Main{
	public static void main(String[] args) {
		
		Scanner sc   = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int x = (int) (Math.log(m)/Math.log(2));
			System.out.println(x);

		}
	}
}
