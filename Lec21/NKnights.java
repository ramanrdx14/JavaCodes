package Lec21;

public class NKnights {
    public static int count = 0;
	public static void Nknights(boolean[][] board,int tk,int kpsf,int row,int col,String result) {
    	if(kpsf == tk) {
    		System.out.println(++count+"."+result);
    		return;
    	}
    	if(row == board.length) {
    		return;
    	}
    	if(col == board.length) {
    		Nknights(board, tk, kpsf, row+1, 0, result);
    		return;
    	}
    	
    	//Place
    	if(isItSafe(board,row,col)) {
    	board[row][col] = true;
    	Nknights(board, tk, kpsf+1, row, col+1, result+"{"+row+","+col+"}");
    	board[row][col] = false;
    	}
    	
    	//Not Place
    	Nknights(board, tk, kpsf, row, col+1, result);
    }
    public static boolean isItSafe(boolean[][] board,int row,int col) {
    	int[] RowArray = {-1,-1,-2,-2};
    	int[] ColArray = {-2,+2,-1,+1};
    	for(int i=0;i<4;i++) {
    		int r = row + RowArray[i];
    	    int c = col + ColArray[i];
    	    if(r >=0 && c >= 0 && r < board.length && c < board[0].length) {
    	    	if(board[r][c] == true) {
    	    		return false;
    	    	}
    	    }
    	}
    	return true;
    }
	public static void main(String[] args) {
		Nknights(new boolean[3][3], 3, 0, 0, 0, "");
	}

}
