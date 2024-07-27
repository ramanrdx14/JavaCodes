package Lec14Assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class MurthalPrathana {
    public static void minTimeToCookAllParatha(int[] ranks,int paratha,int cooks) {
    	Arrays.sort(ranks);
    	int lo   = 0;
    	int hi   = Integer.MAX_VALUE;
    	int ans  = 0;
    	while(lo <= hi) {
    		int mid = (lo+hi)/2;
    		if(isItPossibleToCookAllParathaAt(mid,cooks,ranks,paratha)) {
    			ans = mid;
    			hi  = mid -1;
    		}else {
    			lo  = mid +1;
    		}
    	}
    	System.out.println(ans);
    }
	private static boolean isItPossibleToCookAllParathaAt(int mid, int cooks, int[] ranks, int parathas) {
		int cookCount = 1;    // cook ka count
		int rank         = 0; // ranks 
		int time      = 0; // time taking by cook 
		int paratha   = 1; //paratha count 
		while(rank < ranks.length) {
			if(time+(ranks[rank]*paratha) <= mid) {
				time += (ranks[rank]*paratha);
				paratha++;
				parathas--;
			}else {
				time = 0;
				rank++;
				cookCount++;
				paratha = 1;
			}
			if(parathas == 0) {
				return true;
			}
			if(cookCount > cooks) {
				return false;
			}
			
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t            = sc.nextInt();
		while(t-->0) {
		int paratha      = sc.nextInt(); //paratha
		int cooks      = sc.nextInt(); //cooks
		int[] ranks = new int[cooks];
		for(int i=0;i<ranks.length;i++) {
			ranks[i] = sc.nextInt();
		}
		minTimeToCookAllParatha(ranks,paratha,cooks);
		}
	}

}
