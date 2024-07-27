package Lec18;

public class FactorialTailRecursion {
    public static int factorial(int n,int result) {
    if(n == 0) return result;
    
    int myresult = result * n;
    int recursionReuslt = factorial(n-1,myresult);
    return recursionReuslt;
    }
	public static void main(String[] args) {
	System.out.println(factorial(5, 1));
	}
}
