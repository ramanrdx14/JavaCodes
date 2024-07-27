package Lec21;

public class CoinChangeCombination {
    public static void coinChangeCombination(int[] denominations,int ammount,int ldi,String result) {
    	if(ammount == 0) { // +ve Base Case
    		System.out.println(result);
    		return;
    	}
    	if(ammount < 0) { //-ve Base Case
    		return;
    	}
    	for(int i=ldi;i<denominations.length;i++) {
    		int remaining_ammount = ammount-denominations[i];
    		coinChangeCombination(denominations,remaining_ammount , i, result+denominations[i]);
    	}
    }
	public static void main(String[] args) {
		int[] arr = {1,2,5};
		coinChangeCombination(arr, 5, 0, "");
	}

}
