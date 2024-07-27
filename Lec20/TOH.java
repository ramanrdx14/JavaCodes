package Lec20;

public class TOH {
    public static void TOH(int n,char source,char destination,char helper) {
    	if(n == 0) {
    		return;
    	}
    	TOH(n-1,source, helper, destination);
    	System.out.println("Move "+n+"th disk from "+source+" to "+destination);
    	TOH(n-1, helper, destination, source);
    }
	public static void main(String[] args) {
		TOH(3, 'S', 'D', 'H');

	}

}
