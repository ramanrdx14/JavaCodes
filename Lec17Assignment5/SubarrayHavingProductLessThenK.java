package Lec17Assignment5;

import java.util.Scanner;

public class SubarrayHavingProductLessThenK {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int k      = sc.nextInt();
		int[] arr  = new int[n];
		for(int i=0;i<arr.length;i++)arr[i]=sc.nextInt();
		
		int ei = 0;
		int si = 0;
		int prod = 1;
		int ans  = 0;
		while(ei < arr.length) {
			prod *= arr[ei];  // growing
			
			while(prod >= k && si < ei) {  // shrinking till window thik na hojai
				prod/=arr[si];
				si++;
			}
			
			ans +=ei-si+1;
			ei++;
		}
		System.out.println(ans);
	}
}
