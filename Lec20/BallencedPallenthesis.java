package Lec20;

public class BallencedPallenthesis {
    public static void print(int n,int oc,int cc,String result) {
    	if(oc == n && cc == n) {
    		System.out.println(result);
    		return;
    	}
    	if(cc > oc || oc >n || cc > n) {
    		return;
    	}
    	print(n, oc+1, cc, result+"(");
    	print(n, oc, cc+1, result+")");
    }
	public static void main(String[] args) {
		print(2, 0, 0, "");

	}

}
