package Lec20;

public class PrintMazePathDiganolly {
	public static void print(int sr,int sc,int er,int ec,String result) {
    	if(sr > er || sc > ec) {
    		return;
    	}
    	if(sr == er && sc == ec) {
    		System.out.println(result);
    		return;
    	}
    	
    	print(sr, sc+1, er, ec, result+"H");  // horizontly
    	print(sr+1, sc, er, ec, result+"V");  // vertically
    	print(sr+1, sc+1, er, ec, result+"D");//Diagonal
    }
	public static void main(String[] args) {
		print(0, 0, 2, 2, "");
	}

}
