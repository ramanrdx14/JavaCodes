package Lec17Assignment5;

import java.util.Scanner;

public class FormBiggestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t      = sc.nextInt();
		while(t-- > 0){
			int n        = sc.nextInt();
			String[] arr = new String[n];
			for(int i=0;i<arr.length;i++){
				arr[i] = sc.next();
			}
			for(int i=0;i<n;i++){
				for(int j=i+1;j<n;j++){
					long no1 = Long.parseLong(arr[i]+arr[j]);
					long no2 = Long.parseLong(arr[j]+arr[i]);
					if(no2>no1){
						String temp = arr[i];
						arr[i]      = arr[j];
						arr[j]      = temp;
					}
				}
			}
			String str="";
			for(String s:arr){
				str+=s;
			}
			System.out.println(str);

	  }
	}

}
