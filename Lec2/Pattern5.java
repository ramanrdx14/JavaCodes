package Lec2;

public class Pattern5 {

	public static void main(String[] args) {
		int  n = 5;
		int rows = 1;
		int space = 0;
		int stars = n;
		while(rows <= n) {
			int i = 1;
			while(i <= space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while(j <= stars) {
				System.out.print("* ");
				j++;
			}
			//Next row prep
			rows ++;
			stars--;
			space++;
			System.out.println();
		}

	}

}

/*

n= 5


* * * * * 
  * * * * 
    * * * 
      * * 
        * 

*/