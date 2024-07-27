package Lec34_OOP3;

public class Generics {

	
	//Generic Display Method
	public <T>void display(T[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
	   Integer[] arr1 = {1,2,3,4,5};
	   String[] arr2 = {"a","b","c"};
	   Generics g = new Generics();
	   g.display(arr1);
	   g.display(arr2);

	}

}
