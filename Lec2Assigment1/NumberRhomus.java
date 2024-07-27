package Lec2Assigment1;

import java.util.Scanner;

public class NumberRhomus {

	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n      = sc.nextInt();
        int rows   = 1;
        int spaces = n-1;
        int stars  = 1;
        int k      = 1;
        while(rows <= (2*n)-1) {
        	int i = 1;
        	while(i <= spaces) {
        		System.out.print("  ");
        		i++;
        	}
        	int j = 1;
        	int z = k;
        	while(j <= stars) {
        		if(j <= (stars/2)) {
        			System.out.print(z+" ");
        			z++;
        		}else {
        			System.out.print(z+" ");
        			z--;
        		}
        		j++;
        	}
        	if(rows < n) {
        		stars+=2;
        		spaces--;
        		k++;
        	}else {
            	stars-=2;
            	spaces++;
            	k--;
        	}
        	rows++;
        	System.out.println();
        }
    }

}
