package Lec21;

public class NQueens {
    public static void Nqueens(boolean[][] board,int row,int tq,int qpsf,String result) {
    	if(tq == qpsf) {
    		System.out.println(result);
    		return;
    	}
    	
    	if(row == board.length) {
    		return;
    	}
    	
    	for(int i=0;i<board.length;i++) {
    		if(isItSafe(board,row,i)){
    			board[row][i] = true;
    			Nqueens(board, row+1, tq, qpsf+1, result+"{"+row+","+i+"}");
    			board[row][i] = false;
    		}
    	}
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
		Nqueens(new boolean[4][4], 0, 4, 0, "");
	}

}
