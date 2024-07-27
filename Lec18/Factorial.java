package Lec18;

public class Factorial {
    public static int factorial(int n) {
    	return n*factorial(n-1);
    }
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

}
