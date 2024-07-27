package Lec35;

public class Car implements Comparable<Car>{
	int speed;
	int price;
	String color;
	public Car(int speed,int price,String color) {
		this.speed = speed;
		this.price = price;
		this.color = color;
	}
	@Override
	public String toString() {
		return this.speed+" "+this.price+" "+this.color;
	}
	@Override
	public int compareTo(Car o) {
		
		//return this.color.compareTo(o.color);  for color sorting
		//return this.speed - o.speed;  for speed sorting
		return this.price - o.price;   //for price sorting
	}
}
