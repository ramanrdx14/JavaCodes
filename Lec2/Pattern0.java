package Lec2;

public class Pattern0 {

	public static void main(String[] args) {
		
		int n = 5;
		int stars = 5;
		int row = 1;
		while(row <= n) {
			int i = 1;
			while(i <= stars) {
				System.out.print("* ");
				i++;
			}
			//Next row prep
			System.out.println();
			row++;
		}
	}

}

/*

* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

*/
