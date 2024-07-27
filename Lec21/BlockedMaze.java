package Lec21;

public class BlockedMaze {
    public static void blockedMaze(int[][] maze,int cr,int cc,String result) {
    	
    	//positive base case
    	if(cc == maze[0].length-1 && cr == maze.length-1) {
    		System.out.println(result);
    		return;
    	}
    	
    	//negative base case
    	if(cc >= maze[0].length || cr >= maze.length || cc < 0 || cr < 0) {
    		return;
    	}
    	
    	
    	if(maze[cr][cc] == 9999 || maze[cr][cc] == 1) {
    		return;
    	}
    	
    	//put a mark
    	maze[cr][cc] = 9999;
    	
    	//upwardDirection
    	blockedMaze(maze, cr-1, cc, result+"U");
    	//Downward
    	blockedMaze(maze, cr+1, cc, result+"D");
    	//left
    	blockedMaze(maze, cr, cc-1, result+"L");
    	//right
    	blockedMaze(maze, cr, cc+1, result+"R");
    	maze[cr][cc] = 0;
    }
	public static void main(String[] args) {
		int[][] board = {
				{0,1,0,0},
				{0,0,0,0},
				{0,1,0,0},
				{0,0,1,0}
		};
		blockedMaze(board, 0, 0, "");
	}

}
