package Lec35;
import java.util.Arrays;
import java.util.Comparator;

public class BooksClient {
	public static void main(String[] args) {
		Books[] arr = new Books[5];
		arr[0]      = new Books(700,"alax");
		arr[1]      = new Books(300,"bako");
		arr[2]      = new Books(400,"cat");
		arr[3]      = new Books(1200,"Zebra");
		arr[4]      = new Books(1900,"Mango");
		
		display(arr);
		bubbleSort(arr, new BooksComparator());
		display(arr);
		
		//OR 
		
		Arrays.sort(arr,new Comparator<Books>() {

			@Override
			public int compare(Books o1, Books o2) {
				return o1.price - o2.price;
			}
		});
		
	}
	public static <T> void bubbleSort(T[] arr,Comparator<T> comp){
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(comp.compare(arr[j], arr[j+1])> 0) {
					T temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
	}
	public static <T>void display(T[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-------------------------------------");
	}
}
