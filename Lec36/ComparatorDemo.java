package Lec36;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Car> al = new ArrayList<>();
		al.add(new Car(1102924,"red"));
		al.add(new Car(1441411,"blue"));
		al.add(new Car(1416114,"green"));
		al.add(new Car(5463661,"white"));
		al.add(new Car(9278442,"orange"));
		System.out.println(al);
		Collections.sort(al, new CarSort());
		System.out.println(al);
	}

}
class Car{
	int price;
	String color;
	Car(int price,String color){
		this.price = price;
		this.color = color;
	}
	@Override
	public String toString() {
		return this.color+","+this.price;
	}
}

class CarSort implements Comparator<Car>{

	@Override
	public int compare(Car o1, Car o2) {
		
		return o1.color.compareTo(o2.color);
	}

}
