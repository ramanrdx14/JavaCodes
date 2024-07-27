package Lec21;

public class QueenCombination1_D {
	static int count = 0;
    public static void queenCombination(boolean[] board,int tq,int qpsf,String result,int lastBoxUsed)
    {
    	if(tq == qpsf) {
    		count ++;
    		System.out.println(count +"."+result);
    		return;
    	}
    	
    	for(int i=lastBoxUsed+1;i<board.length;i++) {
    		//if(board[i] == false) {  // ye call lagana is not needed
    			
    			board[i] = true;    // queen  ko bethana
    			queenCombination(board, tq, qpsf+1, result+"B"+i+"Q"+qpsf+" ", i);
    			//undochanges 
    			board[i] = false;
    		//}
    	}
    }
    public static void main(String[] args) {
    	queenCombination(new boolean[3],2,0,"",-1);

	}

}
