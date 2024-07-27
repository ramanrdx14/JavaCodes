package Lec39Assignment9;

import java.util.Scanner;
import java.util.*;
public class SubArraysWithDistinctElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int[] arr  = new int[n];
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		Set s = new HashSet<>();
        int j = 0, ans = 0;
        for (int i = 0; i < n; i++) {
            while (j < n && !s.contains(arr[j])) {
                s.add(arr[j]);
                j++;
            }
            
            ans += ((j - i) * (j - i + 1)) / 2;
            System.out.println(i+"."+j);
            s.remove(arr[i]);
        }
        System.out.println(ans%1000000007);
	}

}
