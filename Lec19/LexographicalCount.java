package Lec19;

import java.util.ArrayList;

public class LexographicalCount {
    public static void print(int current,int range,ArrayList<Integer> list) {
    	if(current > range) {
    		return;
    	}
    	if(current != 0) {
    		list.add(current);
    	}
    	int i=0;
    	if(current == 0) {
    		i = 1;
    	}
    	for(;i<=9;i++) {
    		print(current*10+i, range,list);
    	}
    }
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		print(0, 13,al);
		System.out.println(al);
	}

}
