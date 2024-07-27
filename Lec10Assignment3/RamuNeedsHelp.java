package Lec10Assignment3;
import java.util.*;
public class RamuNeedsHelp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t      = sc.nextInt();
		while(t-->0) {
		int c1     = sc.nextInt();
		int c2     = sc.nextInt();
		int c3     = sc.nextInt();
		int c4     = sc.nextInt();
		int rikshaw = sc.nextInt();
		int cabs    = sc.nextInt();
		int[] rikshawRides = new int[rikshaw];
		for(int i=0;i<rikshawRides.length;i++) {
			 rikshawRides[i] = sc.nextInt();
			}
		
		   //Calculating the min cost of rikshaw
		    int sum1 = 0;
			for(int i=0;i<rikshawRides.length;i++) {
				sum1+=Math.min(c1*rikshawRides[i],c2);
			}
			sum1 = Math.min(sum1, c3);
		  //Calculating the min cost of cab
			int[] cabRides = new int[cabs];
			for(int i=0;i<cabRides.length;i++) {
				 cabRides[i] = sc.nextInt();
				}
			int sum2 = 0;
			for(int i=0;i<cabRides.length;i++) {
				sum2+=Math.min(c1*cabRides[i],c2);
			}
			sum2 = Math.min(sum2, c3);
			System.out.println(Math.min(sum1+sum2, c4));
		}
		
	}

}
