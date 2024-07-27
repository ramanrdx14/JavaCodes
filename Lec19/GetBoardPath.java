package Lec19;
import java.util.ArrayList;
public class GetBoardPath {
    public static ArrayList<String> getpath(int dice,int current,int destination){
    	if(destination == current) {
    		ArrayList<String> baseresult = new ArrayList<>();
    		baseresult.add("");
    		return baseresult;
    	}
    	if(destination < current) {
    		ArrayList<String> baseresult = new ArrayList<>();
    		return baseresult;
    	}
    	ArrayList<String> myresult = new ArrayList<>();
    	for(int i=1;i<=dice;i++) {
    		ArrayList<String> rr = getpath(dice,current+i ,destination);
    		for(int j=0;j<rr.size();j++) {
    			myresult.add(i+rr.get(j));
    		}
    	}
    	return myresult;
    }
	public static void main(String[] args) {
		System.out.println(getpath(6,0,10).size());

	}

}
