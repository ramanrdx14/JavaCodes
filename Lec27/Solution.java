package Lec27;

import java.util.* ;
import java.io.*; 
public class Solution {

	public static String manacherAlgo(String str) {
		//AXIS ORBIT ALGO
		String ans = "";
		int anslen = Integer.MIN_VALUE;
		//for even length
		for(int axis=0;axis<str.length();axis++){
			String substringans = "";
			for(int orbit=0;(axis+orbit)< str.length() && (axis-orbit) >=0;orbit++){
				 if(str.charAt((axis-orbit)) != str.charAt((axis+orbit))){
					 break;
				 }
				 substringans = str.substring((axis-orbit),axis)+str.substring(axis,(axis+orbit));
				 
			}
			if(substringans.length() > anslen){
					 anslen = substringans.length();
					 ans    = substringans;
			}
		 }


		 //for odd length
		 for(double axis=0.5;axis<str.length();axis++){
			String substringans = "";
			for(double orbit=0.5;(axis+orbit)< str.length() && (axis-orbit) >=0;orbit++){
				 if(str.charAt((int)(axis-orbit)) != str.charAt((int)(axis+orbit))){
					 break;
				 }
				 substringans = str.substring((int)(axis-orbit),(int) axis)+str.substring((int) axis,(int)(axis+orbit));
				 
			}
			if(substringans.length() > anslen){
					 anslen = substringans.length();
					 ans    = substringans;
			}
		 }
		return ans;
	}
}