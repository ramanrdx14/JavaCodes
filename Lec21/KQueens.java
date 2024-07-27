package Lec21;

public class KQueens {

	static int count=0;
    public static void kqueens(boolean[][] board,int tq,int qpsf,int row,String result) {
    	if(tq == qpsf) {
    		System.out.println(++count +"."
    	+result);
    		return;
    	}
    	if(row == board.length) {
    		return;
    	}
    	for(int i=0;i<board[0].length;i++) {
    		if(isItSafe(board, row, i)) {
    		board[row][i] = true;
    		//Place call
    		kqueens(board, tq, qpsf+1, row+1, result+"{"+row+"-"+i+"}");
    		board[row][i] = false;
    		}
    	}
    	//Not place call
    	kqueens(board, tq, qpsf, row+1, result);
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
		kqueens(new boolean[4][4], 3, 0, 0, "");
	}

}
