package Lec21;

public class QueensPermutataion1_D {
	static int count = 0;
	
    public static void printQueenPermutations(boolean[] board,int tq,int qpsf,String result) {
    	if(qpsf == tq) {
    		++count;
    		System.out.println(count+"."+result);
    		
    		return;
    	}
    	for(int i=0;i<board.length;i++) {
    		if(board[i] == false) {
    		board[i] = true;
    		printQueenPermutations(board, tq, qpsf+1,result+"Q"+qpsf+"B"+i+" ");
    		board[i] = false;
    		}
    	}
    }
	public static void main(String[] args) {
		boolean[] board = new boolean[4];
		int queens      = 2;
		printQueenPermutations(board, queens, 0,"");
	}

}
