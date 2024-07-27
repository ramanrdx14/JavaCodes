package Lec20;

public class PrintNQueens {

	public static void  countQueens(boolean[][] board,int row,String result) {
    	if(row == board.length) {
    		System.out.println(result);
    		return;
    	}
    	if(row > board.length) {
    		return;
    	}
    	for(int i=0;i<board[0].length;i++) {
    		if(isItPossibleToPlaceQueen(board,row,i)) {
    			board[row][i] = true;
    			countQueens(board, row+1,result+"{"+row+","+i+"}");
    			board[row][i] = false;
    		}
    	}
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
		countQueens(board, 0,"");
	}

}
