package Lec21;

public class CoinChangePermutations {

    public static void coinChangePermutation(int[] denominations,int ammount,String result) {
    	if(ammount == 0) { // +ve Base Case
    		System.out.println(result);
    		return;
    	}
    	if(ammount < 0) { //-ve Base Case
    		return;
    	}
    	for(int i=0;i<denominations.length;i++) {
    		int remaining_ammount = ammount-denominations[i];
    		coinChangePermutation(denominations,remaining_ammount ,result+denominations[i]);
    	}
    }
	public static void main(String[] args) {
		int[] arr = {2,3,5};
		coinChangePermutation(arr, 8, "");
	}

}
