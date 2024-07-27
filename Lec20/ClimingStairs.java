package Lec20;

public class ClimingStairs {
    public static void differentWays(int n,int current,String result) {
    	if(current == n) {
    		System.out.println(result);
    		return;
    	}
    	if(current > n) {
    		return;
    	}
    	differentWays(n,current+1,result+1);
    	differentWays(n,current+2,result+2);
    	differentWays(n,current+3,result+3);
    	
    }
	public static void main(String[] args) {
		differentWays(4,0,"");
	}

}
