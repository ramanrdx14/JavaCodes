package Lec21;

public class CoinCombinationWRTCoins {
    public static void coinCombination(int[] coins,int col,int amount,String result) {
    	if(amount == 0) {
    		System.out.println(result);
    		return ;
    	}
    	if(amount < 0) {
    		return ;
    	}
    	if(col == coins.length) {
    		return;
    	}
    	coinCombination(coins, col, amount-coins[col], result+coins[col]); // coins will contribute
    	coinCombination(coins, col+1, amount, result);//coin will not contribute
    }
	public static void main(String[] args) {
		int[] coins = {1,2,5};
		coinCombination(coins, 0, 11, "");
	}

}
