package Lec6Assignment2;

import java.util.Scanner;

public class PrintSerise {

	public static void main(String[] args) {
		
			Scanner sc  = new Scanner(System.in);
			int n1      = sc.nextInt();
			int n2      = sc.nextInt();
			int count   = 0;
			int i       = 1;
			while(count!=n1) {
			   int nthTerm = 3*i+2;
			   if(nthTerm%n2 != 0)
				   {
				   	System.out.println(nthTerm);
				    count++;
				   }
			   i++;
			}
		}
	}
