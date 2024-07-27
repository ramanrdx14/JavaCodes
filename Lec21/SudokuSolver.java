package Lec21;
import java.util.*;
public class SudokuSolver {
	public static void sudokuSolver(int[][] board,int cr,int cc) {
    	if(cr == board.length) {
    		display(board);
    		return;
    	}
    	if(cc == board[0].length) {
    		sudokuSolver(board, cr+1, 0);
    		return;
    	}
    	
    	if(board[cr][cc] == 0) {
    		for(int i=1;i<=9;i++) {
    			if(ItIsSafe(board,cr,cc,i)) {
    				board[cr][cc] = i;
    				sudokuSolver(board, cr, cc+1);
    				board[cr][cc] = 0;
    			}
    		}
    	}else {
    		sudokuSolver(board, cr, cc+1);
    	}
    }
	private static boolean ItIsSafe(int[][] board,int cr,int cc,int value) {
		for(int i=0;i<board.length;i++) {
			if(board[cr][i] == value) {
				return false;
			}
		}
		
		for(int i=0;i<board.length;i++) {
			if(board[i][cc] == value) {
				return false;
			}
		}
		
		int r = cr-(cr%3);
		int c = cc-(cc%3);
		for(int i=r;i<r+3;i++) {
			for(int j=c;j<c+3;j++) {
				if(board[i][j] == value) {
					return false;
				}
			}
		}
		return true;
	}
	private static void display(int[][] board) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board.length;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n         = sc.nextInt();
		int[][] board = new int[n][n];
		
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				board[i][j] = sc.nextInt();
			}
		}
		sudokuSolver(board, 0, 0);
	}

}
