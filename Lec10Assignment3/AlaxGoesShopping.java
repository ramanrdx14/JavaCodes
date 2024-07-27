package Lec10Assignment3;
import java.util.*;
public class AlaxGoesShopping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int[] arr  = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int query = sc.nextInt();
		while(query-->0) {
			int price = sc.nextInt();
			int k     = sc.nextInt();
			int count = 0;
			for(int i=0;i<arr.length;i++) {
				if(price%arr[i] == 0) {
					count++;
				}
			}
			if(count >=k) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}

}
