package Lec18;

public class PD {
    public static void PrintDecreasing(int n) {
    	if(n == 0) {
    		return;
    	}
    	System.out.println(n);
    	PrintDecreasing(n-1);
    }
	public static void main(String[] args) {
		PrintDecreasing(5);
	}

}
