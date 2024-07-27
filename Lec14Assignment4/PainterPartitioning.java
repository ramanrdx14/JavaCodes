package Lec14Assignment4;

import java.util.Scanner;

public class PainterPartitioning {
    public static void painterPartition(int[] boards,int painters) {
    	long lo = 0;
    	long sum= 0;
    	long ans= 0;
    	for(int i:boards) {
    		sum+=i;
    	}
    	long hi = sum;
    	while(lo <= hi) {
    		long mid = (lo+hi)/2;
    		if(itIsPossibleToPaintBoard(boards,painters,mid)) {
    			ans= mid;
    			hi = mid -1;
    		}else {
    			lo = mid +1;
    		}
    	}
    	System.out.println(ans);
    }
	private static boolean itIsPossibleToPaintBoard(int[] boards,int painters,long mid) {
		int painterCount = 1;
		int i            = 0;
		int boardsPainted= 0;
		while(i  < boards.length) {
			if(boardsPainted+boards[i] <= mid) {
				boardsPainted+=boards[i];
				i++;
			}else {
				painterCount ++;
				boardsPainted = 0;
			}
			if(painterCount > painters) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int painters = sc.nextInt();
		int n      = sc.nextInt();
		int[] boards = new int[n];
		for(int i=0;i<boards.length;i++) {
			boards[i] = sc.nextInt();
		}
		painterPartition(boards, painters);
	}

}
