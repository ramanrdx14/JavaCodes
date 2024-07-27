package Lec35;

import Lec10.BubbleSort;

public class CarClient {
	public static <T>void  display(T[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static <T extends Comparable<T>>void bubbleSort(T[] arr){
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j].compareTo(arr[j+1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Car[] cars = new Car[5];
		cars[0]     = new Car(200,10,"white");
		cars[1]     = new Car(300,50,"yellow");
		cars[2]     = new Car(483,2,"green");
		cars[3]     = new Car(4354,189,"purple");
		cars[4]     = new Car(728,164,"black");
		display(cars);
		System.out.println("------------------------------");
		bubbleSort(cars);
		display(cars);
		
	}
	
	
}
