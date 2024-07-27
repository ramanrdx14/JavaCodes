package Lec21;

import java.util.Scanner;

public class WordSearch {
    public static boolean search(char[][] board,int cr,int cc,String word,int idx) {
    	if(idx == word.length()) {   //+ve basecase
    		return true;
    	}
    	
    	//-ve base case
    	if(cr == board.length || cr < 0 || cc == board[0].length || cc < 0 || word.charAt(idx) != board[cr][cc]) {
    		return false; 
    	}
    	
    	//4calls 
    	boolean ans1,ans2,ans3,ans4 = false;
    	
    	board[cr][cc] = '#';
    	ans1 = search(board, cr-1, cc, word, idx+1); //top
    	ans2 = search(board, cr+1, cc, word, idx+1); //down
    	ans3 = search(board, cr, cc-1, word, idx+1); // left
    	ans4 = search(board, cr, cc+1, word, idx+1);//right
    	board[cr][cc] = word.charAt(idx);
    	return ans1||ans2||ans3||ans4;
    	
    }
	public static void main(String[] args) {
		
		char[][] arr = {{'A','B','C','E'},
						{'S','F','C','S'},
						{'A','D','E','E'}};
		String word  = "ABCCED";
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j] == word.charAt(0)) {
					if(search(arr, i, j,word,0)) {
						System.out.println("Finded");
						return;
					}
				}
			}
		}
		System.out.println("Not Finded");
	}

}
