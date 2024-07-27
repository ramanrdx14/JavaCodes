package Lec21;

public class QueenCombinationRespectToBox {
    public static void queenCombination(boolean[] board,int tq,int qpsf,String result,int col) {
    	//+ve Basecase
    	if(tq == qpsf) {  
    		System.out.println(result);
    		return;
    	}
    	
    	//-ve Base Case
    	if(col == board.length) { 
    		return;
    	}
    	board[col] = true;
    	queenCombination(board, tq, qpsf+1, result+"B"+col,col+1);
    	board[col] = false;
    	queenCombination(board, tq, qpsf, result,col+1);
    }
	public static void main(String[] args) {
		queenCombination(new boolean[4], 2, 0, "", 0);

	}

}
