package Lec20;

public class PrintBoardPath {
    public static void print(int end,String result,int current) {
    	if(current == end) {
    		System.out.println(result); //+ve base case
    		return;
    	}
    	if(current > end) { //-ve base case
    		return;
    	}
    	for(int i=1;i<=6;i++) {
    		print(end,result+i,current+i);
    	}
    }
	public static void main(String[] args) {
		print(10, "", 0);
	}

}
