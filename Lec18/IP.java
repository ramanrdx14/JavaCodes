package Lec18;

public class IP {

	public static void PrintIncreasing(int n) {
    	if(n == 0) {
    		return;
    	}
    	System.out.println(n);
    	PrintIncreasing(n-1);
    }
	public static void main(String[] args) {
		PrintIncreasing(5);
	}

}
