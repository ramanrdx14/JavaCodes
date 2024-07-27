package Lec20;

public class CountNQueens {
    public static int  countQueens(boolean[][] board,int row) {
    	if(row == board.length) {
    		return 1;
    	}
    	if(row > board.length) {
    		return 0;
    	}
    	int count = 0;
    	for(int i=0;i<board[0].length;i++) {
    		if(isItPossibleToPlaceQueen(board,row,i)) {
    			board[row][i] = true;
    			count = count + countQueens(board, row+1);
    			board[row][i] = false;
    		}
    	}
    	return count;
    }
	private static boolean isItPossibleToPlaceQueen(boolean[][] board, int row, int col) {
		boolean check = true;
		for(int i=row,j=col;i>=0&&j>=0;i--,j--) {  //left digonal
			if(board[i][j] == true) {
				check = false;
			}
		}
		for(int i=row,j=col;i>=0&&j<board.length;i--,j++) { // right digoanal
			if(board[i][j] == true) {
				check = false;
			}
		}
		
		for(int i=row;i>=0;i--){//vertically upwards
			if(board[i][col] == true) {
				check = false;
			}
		}
		return check;
	}
	public static void main(String[] args) {
		boolean[][] board = new boolean[4][4];
		System.out.println(countQueens(board, 0));
	}

}
