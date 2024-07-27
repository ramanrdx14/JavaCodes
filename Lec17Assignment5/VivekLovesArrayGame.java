package Lec17Assignment5;

import java.util.Scanner;

public class VivekLovesArrayGame {
	static int count =0;
    public static int find(int[] arr,int lo,int hi) {
    	int sum = 0;
    	for(int i=lo;i<=hi;i++) {
    		sum+=arr[i];
    	}
    	return sum;
    }
    public static void count(int[] arr,int lo,int hi) {
    	
    	if(lo == hi) {
    		return;
    	}
    	int mid = (lo+hi)/2;
    	count(arr, 0, mid);
    	count(arr,mid+1,hi);
    	int sumleft= find(arr, lo, mid);
        int sumright=find(arr, mid+1, hi);
        if(sumleft == sumright) {
        	count++;
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t      = sc.nextInt();
		while(t -- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<arr.length;i++) {
				arr[i] = sc.nextInt();
			}
			count(arr, 0, n-1);
			System.out.println(count);
		}
		
	}

}
