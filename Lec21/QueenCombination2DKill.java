package Lec21;

public class QueenCombination2DKill {
    public static void queenCombination(boolean[][] board,int tq,int qpsf,int row,int col,String result) {
    	if(tq == qpsf) {
    		System.out.println(result);
    		return;
    	}
    	
    	if(row == board.length) {
    		return;
    	}
    	if(col == board[0].length) {
    		queenCombination(board, tq, qpsf, row+1, 0, result);
    		return;
    	}
    	if(isItSafe(board,row,col)) {
    		board[row][col] = true;
    		queenCombination(board, tq, qpsf+1, row, col+1, result+"{"+row+","+col+"}");
    		board[row][col] = false;
    	}
    	queenCombination(board, tq, qpsf, row, col+1, result);
    }
    public static boolean isItSafe(boolean[][] board,int row,int col) {
    	
    	//digonally left
    	boolean b = true;
    	for(int i=row,j=col;i>=0 && j>=0;i--,j--) {
    		if(board[i][j] == true) {
    			b = false;
    		}
    	}
    	
    	//digonally right
    	for(int i=row,j=col;i>=0 && j<board[0].length;i--,j++) {
    		if(board[i][j] == true) {
    			b = false;
    		}
    	}
    	
    	//vertically top
    	for(int i=row;i>=0;i--) {
    		if(board[i][col] == true) {
    			b = false;
    		}
    	}
    	
    	//horizontlly left
    	for(int j=col;j>=0;j--) {
    		if(board[row][j] == true) {
    			b = false;
    		}
    	}
    	
    	return b;
    }
	public static void main(String[] args) {
		queenCombination(new boolean[4][4], 4, 0, 0, 0, "");
	}

}
