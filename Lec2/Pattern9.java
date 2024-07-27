package Lec2;
import java.util.Scanner;;
public class Pattern9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int rows   = 1;
		int stars  = 1;
		int space  = n - 1;
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
			rows++;
			space--;
			stars +=2;
			System.out.println();
		}
	}

}
/*
 
 n = 5;
 
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 


*/
