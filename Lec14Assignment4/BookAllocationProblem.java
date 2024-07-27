package Lec14Assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class BookAllocationProblem {
    public static void bookAllocate(int[] pages,int students) {
    	int lo = 0;
    	int sum = 0;
    	int ans = 0;
    	for(int i:pages) {
    		sum+=i;
    	}
    	int hi = sum;
    	while(lo <= hi) {
    		int mid = (lo+hi)/2;
    		if(isItPossibleToRead(mid,pages,students)) {
    			ans = mid;
    			hi = mid -1;
    		}else {
    			lo = mid +1;
    		}
    	}
    	System.out.println(ans);
    }
	private static boolean isItPossibleToRead(int mid, int[] pages, int students) {
		int pagesRead = 0;
		int i = 0;
		int studentReadenPages = 1;
		while(i < pages.length) {
			if(pagesRead+pages[i] <= mid) {
				pagesRead+=pages[i];
				i++;
			}else {
				pagesRead = 0;
				studentReadenPages ++;
			
			}
			if(studentReadenPages > students) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t      = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int s = sc.nextInt();
			int[] pages = new int[n];
			for(int i=0;i<pages.length;i++) {
				pages[i] = sc.nextInt();
			}
			Arrays.sort(pages);
			bookAllocate(pages,s);
		}
	}

}
