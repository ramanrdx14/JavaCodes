package Lec4;

public class PascalTriangle {

	public static void main(String[] args) {
		int n = 6;
		int rows = 0;
		int stars= 1;
		while(rows < n) {
			int i = 0;
			int val = 1;
			while(i < stars) {
				System.out.print(val+" ");
				val = (rows-i)*val/(i+1);
				i++;
			}
			rows++;
			stars+=1;
			System.out.println();
		}

	}

}
