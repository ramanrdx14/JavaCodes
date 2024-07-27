package Lec21;

public class QueenCombinationWRTB2D {
    public static void queenCombination(boolean[][] board,int tq,int qpsf,int row,int col,String ans)
    {
    	if(tq == qpsf) {
    		System.out.println(ans);
    		return;
    	}
    	if(row == board.length) { //-ve Base case
    		return;
    	}
    	if(col == board[0].length) {
    		queenCombination(board, tq, qpsf, row+1, 0, ans);
    		return;
    	}
    	board[row][col] = true;
    	queenCombination(board, tq, qpsf+1, row, col+1, ans+"{"+row+","+col+"}");
    	board[row][col] = false;
    	queenCombination(board, tq, qpsf, row, col+1, ans);
    }
    public static void main(String[] args) {
		queenCombination(new boolean[2][2], 2, 0, 0, 0, "");
	}

}
