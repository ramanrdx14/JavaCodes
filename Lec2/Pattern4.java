package Lec2;

public class Pattern4 {

	public static void main(String[] args) {
		int n = 5;
		int rows = 1;
		int stars= 1;
		int spaces = n-1;
		while(rows <= n) {
			int j = 1;
			while(j <= spaces) {
				System.out.print("  ");
				j++;
			}
			int i = 1;
		    while(i <= stars) {
		    	System.out.print("* ");
		    	i++;
		    }
		    
		  //Next row prep
		    stars ++;
		    rows  ++;
		    spaces--;
		    System.out.println();
		}

	}

}

/*

n = 3;


     *
   * *
 * * *

n = 5
        * 
      * * 
    * * * 
  * * * * 
* * * * * 

*/