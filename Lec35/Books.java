package Lec35;

public class Books {
	int price;
	String name;
	Books(int price,String name){
		this.price = price;
		this.name  = name;
	}
	@Override
	public String toString() {
		
		return this.name+" "+this.price;
	}
}
