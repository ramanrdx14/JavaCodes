package Lec2;

public class Pattern1 {

	public static void main(String[] args) {
		int n = 5;
		int stars = 1;
		int rows  = 1;
		while(rows <= n) {
			int i = 1;
			while( i <= stars) {
				System.out.print("* ");
				i++;
			}
			//Next row prep
			rows++;
			stars++;
			System.out.println();
		}
	}

}

/*
 n = 5
* 
* * 
* * * 
* * * * 
* * * * * 


*/
